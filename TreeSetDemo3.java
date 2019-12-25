import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator3());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);
    }
}

class MyComparator3 implements Comparator
{
    @Override
    public int compare(Object obj1, Object obj2) {
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;

        //Various implementation of comparator or compare() method
        return - I1.compareTo(I2);
        //return  I1.compareTo(I2);
        //return  I2.compareTo(I1);
        //return  - I2.compareTo(I1);
        //return 1;
        //return -1;
        //return 0; // Only first element will be inserted

    }
}