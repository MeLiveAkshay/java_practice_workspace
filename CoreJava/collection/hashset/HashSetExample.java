package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample
{
    public static void main(String[] args)
    {
        HashSet <Integer> hashSet=new HashSet<>();
        hashSet.add(52);
        hashSet.add(59);
        hashSet.add(85);
        hashSet.add(53);
        hashSet.add(35);
        hashSet.add(59);
        hashSet.add(53);
        hashSet.add(85);

        System.out.println("Integer HashSet Element : ");
        Iterator<Integer> iterator=hashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next()+" ");    
        }

        HashSet <String> hashSet2=new HashSet<>();
        hashSet2.add("Hello");
        hashSet2.add("Bye");
        hashSet2.add("bye");
        hashSet2.add("Hello");
        hashSet2.add("neha");
        hashSet2.add("bye");
        hashSet2.add("Bye");


        System.out.println("HashSet Element : ");
        System.out.println(" String HashSet Element  : "+ hashSet2);

        Iterator <String> iterator2=hashSet2.iterator();
        while (iterator2.hasNext())
        {
            System.out.println(iterator2.next()+" ");
        }

    }
    
}
