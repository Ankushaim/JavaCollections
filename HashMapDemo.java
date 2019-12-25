import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("Chiranjeevi", 700);
        m.put("Raju", 800);
        m.put("BabuRao", 200);
        m.put("Shaym",500);
        System.out.println(m); // {BabuRao=200, Shaym=500, Chiranjeevi=700, Raju=800}
        System.out.println(m.put("Chiranjeevi", 1000));
        System.out.println(m);

        Set s = m.keySet();
        System.out.println(s);

        Collection c = m.values();
        System.out.println(c);

        Set s1 = m.entrySet();
        System.out.println(s1);

        Iterator itr = s1.iterator();
        while(itr.hasNext())
        {
            Map.Entry m1 = (Map.Entry) itr.next();
            if(m1.getKey().equals("BabuRao"))
            {
                m1.setValue(1200);
            }
        }
        System.out.println(m);
    }
}
