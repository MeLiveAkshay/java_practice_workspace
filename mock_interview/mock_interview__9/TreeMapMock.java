package mock_interview.mock_interview__9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMock {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Akshay");
        map.put(2, "Ajay");
        map.put(3, "Vivek");
        map.put(4, "Sumit");
        map.put(6, "Rahul");
        map.put(7, "Sneha");
        map.put(8, "Neha");
        map.put(9, "Suresh");

        System.out.println("Original Map: " + map);

        Set<Integer> set=map.reversed().keySet();
        System.out.println(set);

        Iterator <Integer> iterator=set.iterator();
        while (iterator.hasNext()) {
            Integer integer=iterator.next();
            System.out.println(integer+" is : "+map.get(integer));
        }
    }
}
