
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo
{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l.add("Raju");
        l.add("Shyam");
        l.add("BabuRao");
        l.add("Anuradha");
        System.out.println(l);
        ListIterator itr =  l.listIterator();
        
        while(itr.hasNext())
        {
            String s = (String) itr.next();
            if (s.equals("Anuradha"))
            {
                itr.remove();        
            }
            else if (s.equals("Raju"))
            {
                itr.set("21 din me paise double");
            }
            else if(s.equals("Shyam"))
            {
                itr.add("Goal Maal Hai");
            }
        }
        System.out.println(l);
    }
}