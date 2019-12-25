import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l.add("Durga");
        l.add(30);
        l.add(null);
        l.add("Durga");
        System.out.println(l);
        l.set(0,40);
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        System.out.println(l.getFirst());

    }
}
