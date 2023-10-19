package LinkedListWeek;

public class LinkedList<E> {

    private LinkedNode<E> head;
    private LinkedNode<E> tail;
    private int size;

    // default constructor; empty list
    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return this.size;
    }

    /* * * LINKED NODE DEFINITION * * */

    private class LinkedNode<T>{
        private T item;
        private LinkedNode<T> next;

        // default contructor; empty node
        public LinkedNode(){
            item = null;
            next = null;
        }

        // constructor to set item, no successor
        public LinkedNode(T value){
            item = value;
            next = null;
        }

        // constructor to set item and successor
        public LinkedNode(T value, LinkedNode<T> successor){
            item = value;
            next = successor;
        }
    }
}
