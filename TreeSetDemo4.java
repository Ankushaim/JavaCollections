import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args)
    {
        TreeSet t = new TreeSet(new MyComparator4());
            t.add("Raju");
            t.add("Babu Rao");
            t.add("Shayam");
            t.add("Kachra Seth");
            t.add("Anurdha");
            System.out.println(t);
    }
}

class MyComparator4 implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        //return - s1.compareTo(s2);
        return s2.compareTo(s1);
    }
}
