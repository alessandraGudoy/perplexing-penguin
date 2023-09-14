package Week1;

import java.util.Arrays;

public class RegularProblems {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(hurrayArrays(new int[] {0,2,1,5,3,4})));
        System.out.println(Arrays.toString(hurrayArrays(new int[] {5,0,1,2,3,4})));

        System.out.println(Arrays.deepToString(keyboard(new String[] {"Hello","Alaska","Dad","Peace"})));
        System.out.println(Arrays.deepToString(keyboard(new String[] {"omk", "asdf"})));

        System.out.println(consecOnes(new int[] {1,1,0,1,1,1}));
        System.out.println(consecOnes(new int[] {1,0,1,1,0,1}));
    }


    public static int[] hurrayArrays(int[] nums) {
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[nums[i]];
        }

        return output;
    }


    public static String[] keyboard(String[] arr) {
        String[] output = new String[arr.length];
        int wordCount = 0;

        String qwerty = "qwertyuiop";
        String asdf = "asdfghjkl";
        String zxcv = "zxcvbnm";

        for (String str : arr) {
            String s = str.toLowerCase();
            boolean inRow = true;
            if (qwerty.indexOf(s.substring(0, 1)) != -1) {
                for (int i = 1; i < s.length(); i++) {
                    if (qwerty.indexOf(s.substring(i, i + 1)) == -1) {
                        inRow = false;
                    }
                }
            } else if (asdf.indexOf(s.substring(0, 1)) != -1) {
                for (int i = 1; i < s.length(); i++) {
                    if (asdf.indexOf(s.substring(i, i + 1)) == -1) {
                        inRow = false;
                    }
                }
            } else {
                for (int i = 1; i < s.length(); i++) {
                    if (zxcv.indexOf(s.substring(i, i + 1)) == -1) {
                        inRow = false;
                    }
                }
            }

            if (inRow) {
                output[wordCount] = str;
                wordCount += 1;
            }
        }

        return Arrays.copyOf(output, wordCount);

    }


    public static int consecOnes(int[] nums) {
        int longest = 0;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter += 1;
            } else {
                counter = 0;
            }

            if (counter >= longest) {
                longest = counter;
            }
        }

        return longest;
    }

    // TODO: Given an integer array (nums), find the contiguous subarray with the largest sum, and return its sum.
    public static int maxSumArr(int[] nums) {
        int sum = 0;

        return sum;
    }
}