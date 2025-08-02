package practics.collection_framework.map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeSetPractics {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(25, "Suman");
        treeMap.put(52, "String");
        treeMap.put(86, "Java");

        System.out.println("----------------------------------------------");
        System.out.println("TreeMap : " + treeMap);

        System.out.println("---------------------------------------------");
        Set<Integer> reversedKeySet = treeMap.descendingKeySet();  // Keys in reverse order
        System.out.println("Reversed Keys : " + reversedKeySet);

        Iterator<Integer> iterator = reversedKeySet.iterator();
        while (iterator.hasNext()) {
            Integer currentKey = iterator.next();
            System.out.println(currentKey + " is : " + treeMap.get(currentKey));
        }
    }
}
