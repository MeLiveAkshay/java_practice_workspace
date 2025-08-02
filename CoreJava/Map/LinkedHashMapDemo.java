package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap <String, Integer> hashMap=new LinkedHashMap<>();
        hashMap.put("Vikash", 123);

        System.out.println(hashMap);
        hashMap.put("Vikash", 1520);
        System.out.println(hashMap);

        hashMap.put("Mukesh", 1520);
        System.out.println("1st LinkedHashMap"+hashMap);



        System.out.println("-------------------------------------------------");
        LinkedHashMap<Employee,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(new Employee(1, "Akshay", 15000f), "Java Trainer");
        linkedHashMap.put(new Employee(2, "Priya", 18000f), "Python Trainer");
        linkedHashMap.put(new Employee(3, "Ravi", 17000f), "React Developer");
        linkedHashMap.put(new Employee(4, "Nisha", 16000f), "Node Developer");
        linkedHashMap.put(new Employee(5, "Amit", 19000f), "HR");
        linkedHashMap.put(new Employee(1, "Akshay", 15000f), "Java Trainer Updated"); // Duplicate key
        linkedHashMap.put(new Employee(6, "Rita", 15000f), "DevOps Engineer");
        linkedHashMap.put(new Employee(7, "Raj", 20000f), "Android Dev");
        linkedHashMap.put(new Employee(2, "Priya", 18000f), "Senior Python Trainer"); // Duplicate key
        linkedHashMap.put(new Employee(8, "Sana", 15500f), "Intern");

        System.out.println();

        System.out.println("key : ");
        Set<Employee> setkey=linkedHashMap.keySet();
        System.out.println("key is : "+setkey);

        System.out.println();
        System.out.println("Employee , String and LinkedHashMap : ");
        Iterator<Employee> iterator=setkey.iterator();
        while (iterator.hasNext()) {
            Employee employee=iterator.next();
            System.out.println(employee+" is : "+linkedHashMap.get(employee));
        }
    }
}
