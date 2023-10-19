package HashMapsWeek;

import java.util.HashMap;

public class Question3 {
   public static String[] testCases = new String[]{"thequickbrownfoxjumpsoverthelazydog", "The quick brown fox jumps over the lazy dog", "PANDA", "Sphinx of black quartz judge my vow"};
   public static boolean[] testResults = new boolean[]{true, true, false, true};

   public static boolean mySolution(String testCase) {
        testCase = testCase.toLowerCase();
       HashMap<Integer, String> letters = new HashMap<>();

       
       // Iterate over letters in the alphabet and add to hashmap
       for (int i = 0; i < 26; i++) {
           // Use ASCII to get desired character [a-z]
           char target = (char)(97 + i);
            if(testCase.indexOf(target) != -1){
                letters.put((int) target, testCase.substring(testCase.indexOf(target), testCase.indexOf(target)+1));
            }
       }
       
      return letters.size() == 26;
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
