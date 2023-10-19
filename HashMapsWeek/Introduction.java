package HashMapsWeek;

import java.util.HashMap;
import java.util.LinkedList;

import org.w3c.dom.Node;

public class Introduction {
   public static void main(String args[]) {

    /*
       // HashMap<K, V> name = new HashMap<>
       HashMap<Integer, String> hashmap = new HashMap<>();


       // isEmpty()
       System.out.println("isEmpty()\n" + hashmap.isEmpty() + "\n");


       // put()
       hashmap.put(1, "One");
       hashmap.put(2, "Two");
       hashmap.put(3, "Five");
       System.out.println("Current hashMap\n" + hashmap.toString() + "\n");


       // size()
       System.out.println("size()\n" + hashmap.size() + "\n");


       // containsValue()
       System.out.println("containsValue(\"One\")\n" + hashmap.containsValue("One") + "\n");
       System.out.println("containsValue(\"Three\")\n" + hashmap.containsValue("Three") + "\n");


       // containsKey()
       System.out.println("containsKey(1)\n" + hashmap.containsKey(1) + "\n");
       System.out.println("containsKey(0)\n" + hashmap.containsKey(0) + "\n");


       // get()
       System.out.println("get(1)\n" + hashmap.get(1) + "\n");
       System.out.println("get(0)\n" + hashmap.get(0) + "\n");

    */

       /*
       Turn an array into a hashMap
       Use a "Hashing function" to map the values to a key.
       Expected output: {0=1, 1=2, 2=3, 3=4, 4=5}
        */
       int[] arr = new int[]{1,2,3,4,5};

       HashMap<Integer, Integer> introHashMap1 = new HashMap<>();


       for (int i = 0; i<arr.length; i++) {
           introHashMap1.put(i, arr[i]);
       }
       System.out.println(introHashMap1);


       /*
       Something special (you can put other data structures within the value)
       Use a "Hashing function" to separate the array into "Even" and "Odd"
       and certain methods...
       Expected output: {0=[2, 4], 1=[1, 3, 5]}
       Adding to LinkedList is add()
        */
       HashMap<Integer, LinkedList<Integer>> introHashMap2 = new HashMap<>();
       introHashMap2.put(0, new LinkedList<>());
       introHashMap2.put(1, new LinkedList<>());


       for (int i = 0; i<arr.length; i++){
           if(arr[i] % 2 == 0){
                introHashMap2.get(0).add(arr[i]);;
           } else{
                introHashMap2.get(1).add(arr[i]);;
           }
       }
       System.out.println(introHashMap2);



       // #1
       int[] arr2 = {1,2,3,4,5};
       HashMap<Integer, Integer> ints = new HashMap<>();


       int counter = 0;

       for(int i=0; i<arr2.length; i++){
            
            if(!ints.containsValue(arr2[i])){
                ints.put(i, arr2[i]);
                counter = counter + 1;
            }
       }

       System.out.println(ints.toString());
       System.out.println(counter);

       // #2
       int[] nums = {2,7,11,6,15,3};
       int target = 9;

       HashMap<Integer, Integer> numz = makeIt(nums);
       HashMap<Integer, Integer> numsMap = new HashMap<>();

       for(int i=0; i<nums.length; i++){
            if(numz.containsKey(target - nums[i])){
                numsMap.put(nums[i], numz.get(nums[i]));
                numsMap.put(target-nums[i], numz.get(target-nums[i]));
            }
       }
       System.out.println("\nMaking 9: " + numsMap.toString());

       // #3
       


   }

   public static HashMap<Integer, Integer> makeIt(int[] arr){

        HashMap<Integer, Integer> mapz = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            mapz.put(arr[i], i);
        }
        return mapz;
   }
}
