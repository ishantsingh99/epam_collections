import java.util.*;
public class arraylist {
    static void fetching(List<Integer>l)
    {
        l.get(3);
    }
    static void adding(List<Integer>l)
    {
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(70);
        l.add(80);
        l.add(90);
        l.add(100);
    }
    static void removing(List<Integer>l)
    {
        l.remove(5);
    }
    static void printing(List<Integer>l)
    {
         Iterator i=l.iterator();
         while(i.hasNext())
         {
             System.out.println(i.next());
         }
    }
    public static void main(String args[])
    {
        List<Integer>l=new ArrayList<Integer>();
        adding(l);
        fetching(l);
        removing(l);
        printing(l);
    }
}
