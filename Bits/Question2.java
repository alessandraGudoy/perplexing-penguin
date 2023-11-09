package Bits;

public class Question2 {
    static long test1 = 0b100000;
    static int a1 = 1;
    static int b1 = 6;
    static long test2 = 0b1111;
    static int a2 = 1;
    static int b2 = 4;

    public static void main(String args[]){
        System.out.println(swapBits(test1, a1, b1)); // return 1
        System.out.println(swapBits(test2, a2, b2)); // return 15
    }


    /**
     * Returns the value of bit a and bit b swapped
     * @param input long
     * @param a int
     * @param b int
     * @return long
     */
    public static long swapBits(long input, int a, int b){
        // long mask;
        // long retlong = 0;
        long copy = input;

        int bits = 0;
        while(copy > 0){
            bits = bits + 1;
            copy = copy >> 1;
        }

        long result = input;
        long yo = 0b1;
        int counter = 1;

        copy = input;
        for(int i=0; i<bits; i++){
            // System.out.println(yo);
            if((copy & 0b1) == 0b1){
                result = result & (input);
            }

            else if(counter == a || counter == b){
                result = result ^ (yo);
                // input = input ^ result;
                
            } else if(counter == b){
                result = result ^ (input & yo);
                // input = input ^ result;
            }

            yo = (yo << 1);
            copy = copy >> 1;

            counter = counter + 1;
        }


        return result;
        // return retlong;
    }

}
