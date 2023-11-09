package Bits;

public class Question1 {
    static int test1 = 0b00001011;
    static int test2 = 0b10000000;
    static int test3 = 0b00100000;

    public static void main(String args[]){
        System.out.println(countBits(test1)); // equals 3
        System.out.println(countBits(test2)); // equals 1
        System.out.println(countBits(test3)); // equals 1
    }

    public static int countBits(int input){
        int counter = 0;

        while(input > 0){
            if((input & 0b1) == 0b1){
                counter = counter + 1;
            }
            input = input >> 1;
        }

        return counter;
    }
}
