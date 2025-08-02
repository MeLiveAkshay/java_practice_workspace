package map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Double, String> hashtable = new Hashtable<>();
        hashtable.put(1205.3, "Mukesh");
        hashtable.put(12.02, "Ramesh");
        hashtable.put(85.69, "Mantu");
        hashtable.put(8965.36, "Vukash");

        System.out.println();
        System.out.println("-------------HashTable Element ------------------");
        System.out.println(hashtable);

        System.out.println("----------------------key -----------------");
        Set<Double> key = hashtable.keySet();
        System.out.println(key);

        System.out.println("-------------------Key and Value (Iterator)----------");
        System.out.println();

        Iterator<Double> iterator = key.iterator();
        while (iterator.hasNext()) {
            Double keys = iterator.next();
            System.out.println(keys + " is : " + hashtable.get(keys));
        }
        System.out.println();


        /* 
        //null is not allowed in the HashaTable
        hashtable.put(null, "Mantu");
        hashtable.put(8965.36, "null");//java.lang.NullPointerException
        System.out.println("-------------HashTable Element ------------------");
        System.out.println(hashtable);//java.lang.NullPointerException

        */
    }
}
