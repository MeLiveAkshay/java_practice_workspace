package collection.hashset;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet<>();
        hashSet.add(56);
        hashSet.add(593);
        hashSet.add(56);

        for (Object object : hashSet) {
            System.out.println(" "+object+" ");
            
        }
    }
}
