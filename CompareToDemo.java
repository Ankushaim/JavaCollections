//Program to understand Comparable Interface and compareTo() method. Topic is TreeSet

public class CompareToDemo {
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z"));
        System.out.println("Z".compareTo("K"));
        System.out.println("K".compareTo("K"));
        //System.out.println("A".compareTo(null)); //Null Pointer Exception
        //System.out.println("A".compareToIgnoreCase("a")); //additional method found through IDE
    }
}
