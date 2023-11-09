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

    public boolean add(E value){
        LinkedNode<E> current = head;
        LinkedNode<E> node = new LinkedNode<E>(value);

        if(head == null && tail == null){
            head = node;
            tail = node;
        } else{
            while(current.next != null){
                current = current.next;
            }

            current.next = node;
            tail = node;
        }
        
        size = size + 1;

        return true;
    }

    public boolean add(int index, E value){
        LinkedNode<E> current = head;
        LinkedNode<E> node = new LinkedNode<E>(value);

        if(index < 0 || index > size){
            throw new RuntimeException("invalid index: " + index + "\nMust be between 0 and " + size);
        }

        if(index == size){
            add(value);
            return true;
        }

        if(head == null && tail == null){
            head = node;
            tail = node;
        } else{
            while(index >= 0 && current.next != null){
                current = current.next;
                index = index - 1;
            }

            node.next = current.next;
            current.next = node;

        }

        size = size + 1; 

        return true;
    }

    public String toString(){
        LinkedNode<E> current = head;

        String result = "";

        while(current != null){
            result = result + current.item + "\t";
            current = current.next;
        }

        return result.trim();
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
