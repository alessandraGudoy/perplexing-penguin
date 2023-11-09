package HashMapsWeek;

import java.util.HashMap;

public class Question4 {

   public static int[][] testCases = new int[][]{{1,2,3,1,1,3}, {1,1,1,1}, {1,2,3}};
   public static int[] testResults = new int[]{4, 6, 0};


   public static int mySolution(int[] testCase) {
       /*
       Think about making the problem smaller
       And how you can store data into a HashMap
        */
       HashMap<Integer, Integer> myHashMap = new HashMap<>();

       for(int i=0; i<testCase.length-1; i++){
            int find = testCase[i];
            for(int j=1; j<testCase.length; j++){
                
            }
       }
       return -1;
   }


   public static void checkSolution(){
       for (int i = 0; i<testCases.length; i++){
           if( mySolution(testCases[i]) == testResults[i] ){
               System.out.println("Test case #" + i + " passed");
           }
           else{
               System.out.println("Test case #" + i + " failed");
           }
       }
   }
   public static void main(String args[]){
       checkSolution();
   }
}
