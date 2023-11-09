package Bits;

public class Concepts {
    public static void main(String args[]) {
        /* Binary and shifting */
        // What is 10 (decimal) in binary?
        int ten = 0b1010; //1010 the 0b is to signify binary (0x is for hex)
        System.out.println(ten);

        // 1010 bit-shifting left; bit-shifting right
        System.out.println(ten << 1);   // 10100
        System.out.println(ten >> 1);   // 101

        System.out.println();


        /* Bitwise operators examples */
        // You do not need to specify 0b if you just use decimal it will still work,
        // just make sure it is the correct number (can just use 5 instead of 0b0101)
        int five = 0b0101;
        int nine = 0b1001;

        // & (and)
        System.out.println(five & nine);     // 0101 & 1001 becomes 0001
        System.out.println(five & ten);      // 0101 & 1010 becomes 0000
        System.out.println(0b0111 & 0b1110); // 0111 & 1110 becomes 0110

        System.out.println();

        // | (or)
        System.out.println(five | nine);       // 0101 | 1001 becomes 1101
        System.out.println(five | ten);        // 0101 | 1010 becomes 1111

        System.out.println();

        // ^ (xor)
        System.out.println(0b1001 ^ 0b0110); // becomes 1111
        System.out.println(0b1100 ^ 0b1101); // becomes 0001

        System.out.println();

        // ~ (not) aka complement
        // https://www.tutorialspoint.com/two-s-complement
        // https://www.programiz.com/java-programming/bitwise-operators
        System.out.println(~five); // 0101 flipped turns to 1010
        System.out.println(0b11111111111111111111111111111010); // ints are 32 bits so there is a long sequence of 0 turned into 1
        System.out.println(0b11111111111111111111111111111010 + 1); // adding one will turn it to negative 5
        System.out.println(0b11111111111111111111111111111011); // is the same as above
        System.out.println(~nine); // 1001 flipped to 0110
        System.out.println(0b11111111111111111111111111110110); // added 28 leading 1's

        System.out.println();
        

        /* Masks */
        // How can you swap the bits from 1010 -> 0101 (ignore the leading 0s)
        int test = 0b1010;
        // A more generic example this would be better as a function, but just temporary
        int numBits = 0;
        int copyOfTestValue = test;
        while(copyOfTestValue > 0){
            copyOfTestValue = copyOfTestValue/2;
            numBits++;
        }
        System.out.println(numBits);
        int mask = 1;
        for (int i = 1; i < numBits; i++){
            mask = (mask << 1) + 1;
        }
        System.out.println(mask);
        System.out.println(test^mask);
    }
}
