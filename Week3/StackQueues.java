package Week3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackQueues {

    public static void main(String[] args){
        Queue<Integer> queue = new PriorityQueue<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        
        for(int i = 1; i <= 10; i++){
            queue.add(i);
            stack.add(i+2);
        }
        /* 
        System.out.println(queue.toString());
        System.out.println(stack.toString());

        int[] qArr = new int[queue.size()];
        int[] stackArr = new int[stack.size()];

        int counter = 0;
        while(!queue.isEmpty()){
            qArr[counter] = queue.remove();
            counter += 1;
        }

        
        while(!stack.isEmpty()){
            stackArr[stack.size()-1] = stack.pop();
        }

        System.out.println(Arrays.toString(qArr));
        System.out.println(Arrays.toString(stackArr));
        */

        //System.out.println(validParentheses("()[]{}"));
        System.out.println(stack.toString());
        System.out.println(stackToQueue(stack).toString());
    }

    public static boolean isPalindrome(String str){

        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }

        return true;
    }

    
    public static boolean validParentheses(String str){
        Stack<Character> open = new Stack<Character>();
        Stack<Character> close = new Stack<Character>();

        //char lastOpen = '';

        for(int i = 0; i< str.length(); i++){
            char current = str.charAt(i);

            if(current == '(' || current == '{' || current == '['){
                open.add(current);
            } else if(open.isEmpty() && (current == ')' || current == '}' || current == ']')){
                return false;
            }else if(current == ')' && open.pop() != '(' ){
                close.add(current);
                return false;
            } else if(current == '}' && open.pop() != '{'){
                close.add(current);
                return false;
            } else if(current == ']' && open.pop() != '['){
                close.add(current);
                return false;
            }
        }

        if(open.size() != close.size()){
            return false;
        }

        return true;
    }


    public static Queue stackToQueue(Stack<Integer> stack){
        Queue<Integer> queue = new PriorityQueue<Integer>();
        Queue<Integer> result = new PriorityQueue<Integer>();

        int size = stack.size();

        for(int i = 0; i<size; i++){
            int popped = stack.pop();
            queue.add(popped);
            System.out.println(popped);
            //result.add(queue.remove());
        }

        return queue;
    }
}
