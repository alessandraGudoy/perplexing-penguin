package LinkedListWeek;

public class LLQuestions {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();

        p(list.add("b"));
        p(list.add("c"));
        p(list.add(1,"a"));
        p(list.toString());
    }

    public static <E> void p(E yo){
        System.out.println(yo);
    }
}
