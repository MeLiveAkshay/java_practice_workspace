package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1, "Patna");
        hashMap.put(2,"Patna");
        hashMap.put(3, "Patna");
        System.out.println("Element : "+hashMap);
        hashMap.put(3,"Ranchi");
        System.out.println("Element : "+hashMap);
        hashMap.put(4, "Pune");

        System.out.println("Element : "+hashMap);



        Set<Integer> setKey=hashMap.keySet();
        System.out.println("key : "+setKey);

        Iterator<Integer> iterator=setKey.iterator();
        while (iterator.hasNext()) {
            Integer key=iterator.next();
            System.out.println(key +" is : "+hashMap.get(key));
            
        }

        System.out.println("----------------------------------------------");
        HashMap<String,Double> hashMap2=new HashMap<>();
        hashMap2.put("hello", 15.3);
        hashMap2.put("hey", 25.3);
        hashMap2.put("welcome", 85.3);
        hashMap2.put("name", 95.3);
        hashMap2.put("Hello", 85.3);
        hashMap2.put("Bye", 95.3);
        hashMap2.put("bye", 895.3);
        hashMap2.put("Bye", 85.3);
        hashMap2.put("hello", 45.3);
        hashMap2.put("hello", 95.3);
        hashMap2.put("Setter", 75.3);
        hashMap2.put("hello", 95.3);
        hashMap2.put("hello", 15.3);
        hashMap2.put("hello", 15.3);
        hashMap2.put("sandeep", null);

        System.out.println(hashMap2);


        System.out.println("-----------------------------------------------------------");
        HashMap<Employee,String> hashMap3=new HashMap<>();
        hashMap3.put(new Employee(1, "Akshay", 15000f), "Java Trainer");
        hashMap3.put(new Employee(2, "Priya", 18000f), "Python Trainer");
        hashMap3.put(new Employee(3, "Ravi", 17000f), "React Developer");
        hashMap3.put(new Employee(4, "Nisha", 16000f), "Node Developer");
        hashMap3.put(new Employee(5, "Amit", 19000f), "HR");
        hashMap3.put(new Employee(1, "Akshay", 15000f), "Java Trainer Updated"); // Duplicate key
        hashMap3.put(new Employee(6, "Rita", 15000f), "DevOps Engineer");
        hashMap3.put(new Employee(7, "Raj", 20000f), "Android Dev");
        hashMap3.put(new Employee(2, "Priya", 18000f), "Senior Python Trainer"); // Duplicate key
        hashMap3.put(new Employee(8, "Sana", 15500f), "Intern");


        System.out.println(hashMap3);

        Set<Employee> keys=hashMap3.keySet();
        Iterator<Employee> iterator2=keys.iterator();

        while (iterator2.hasNext()) {
            Employee employee=iterator2.next();
            System.out.println(employee +" : "+ hashMap3.get(employee));
        }

    }
}
