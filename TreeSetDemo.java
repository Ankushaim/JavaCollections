import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("A");
        t.add("a");
        t.add("B");
        t.add("Z");
        t.add("L");
        //t.add(null); // null pointer exception
        //t.add(new Integer(10)); // ClassCastException
        System.out.println(t); // Output natural sorting order.
    }
}
