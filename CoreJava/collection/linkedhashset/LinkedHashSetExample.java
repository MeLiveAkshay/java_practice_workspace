package collection.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

import collection.hashset.Product;



public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet <Integer> hashSet=new LinkedHashSet<>();
        hashSet.add(52);
        hashSet.add(59);
        hashSet.add(85);
        hashSet.add(53);
        hashSet.add(35);
        hashSet.add(59);
        hashSet.add(53);
        hashSet.add(85);

        System.out.println("Integer LinkedHashSet Element : ");
        Iterator<Integer> iterator=hashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next()+" ");    
        }


        LinkedHashSet <String> hashSet2=new LinkedHashSet<>();
        hashSet2.add("Hello");
        hashSet2.add("Bye");
        hashSet2.add("bye");
        hashSet2.add("Hello");
        hashSet2.add("neha");
        hashSet2.add("bye");
        hashSet2.add("Bye");


        System.out.println("LinkedHashSet Element : ");
        System.out.println(" String LinkedHashSet Element  : "+ hashSet2);

        Iterator <String> iterator2=hashSet2.iterator();
        while (iterator2.hasNext())
        {
            System.out.println(iterator2.next()+" ");
        }


        LinkedHashSet<Product> hashSet3=new LinkedHashSet<>();

        hashSet3.add(new Product(12, "Mobile", 153820, "Electronic"));
        hashSet3.add(new Product(12, "Mobile", 153820, "Electronic"));
        hashSet3.add(new Product(13, "Laptop", 75820, "Electronic"));
        hashSet3.add(new Product(14, "Refrigerator", 35820, "Appliance"));
        hashSet3.add(new Product(15, "Washing Machine", 25820, "Appliance"));
        hashSet3.add(new Product(16, "TV", 55820, "Electronic"));
        hashSet3.add(new Product(19, "Book", 150, "stationary"));
        hashSet3.add(new Product(13, "Laptop", 75820, "Electronic"));
        hashSet3.add(new Product(14, "Refrigerator", 35820, "Appliance"));
        hashSet3.add(new Product(15, "Washing Machine", 25820, "Appliance"));

        Product product=new Product(15, "Washing Machine", 25820, "Appliance");
        hashSet3.add(product);

        Product product2=new Product(15, "Washing Machine", 25820, "Appliance");
        hashSet3.add(product2);


        System.out.println("hashcode value of the project : "+product.hashCode());
        System.out.println("hashcode value of the project2 : "+product2.hashCode());
        System.out.println("project equal project2 : "+product.equals(product2));


        System.out.println("Product Element : ");
        Iterator<Product> iterator3=hashSet3.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next()+" ");
            
        }
    }

}
