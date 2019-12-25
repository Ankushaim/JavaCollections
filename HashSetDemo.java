import java.util.HashSet;
public class HashSetDemo
{
    public static void main(String[] args)
    {
        HashSet h = new HashSet();
        h.add("A");
        h.add("B");
        h.add("C");
        h.add(10);
        h.add(null);
        System.out.println(h.add("A"));// Duplicates are not allowed
        System.out.println(h.add(null)); // Null allowed only once
        System.out.println(h); // Insertion order is not preserved
        
    }
}