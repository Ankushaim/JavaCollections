import java.util.*;
public class LinkedHashSetDemo
{
    public static void main(String[] args)
    {
        LinkedHashSet lh = new LinkedHashSet();
        lh.add("A");
        lh.add("c");
        lh.add("B");
        lh.add(10);
        lh.add(null);
        System.out.println(lh);
        System.out.println(lh.add(10)); //duplicate objects are not allowed
        
        
    }
}