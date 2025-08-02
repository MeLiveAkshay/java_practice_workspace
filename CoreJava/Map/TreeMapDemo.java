package map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap=new TreeMap<>();
        tMap.put(12, "Hello");
        tMap.put(14, "hello");
        tMap.put(56,"Bye");
        tMap.put(14, "Byeyye");

        System.out.println(tMap);

        //tMap.put(null, "Geeta");// it does not have null key in the treeMap 
        System.out.println(tMap);//NullPointerException

        System.out.println("2nd Tree Map");
        TreeMap <String , Integer> tMap2= new TreeMap<>();
        tMap2.put("vikash", 1235);
        tMap2.put("mukesh",4589);
        tMap2.put("Akshay",2347);
        tMap2.put("Vikash", 1235);
        tMap2.put("Mukesh",4589);
        tMap2.put("akshay",2347);
        System.out.println();
        System.out.println(tMap2);

        System.out.println();
        System.out.println("This is the frist tree map of the Product and Sttring");
        TreeMap<ProductModel,String>tMap3=new TreeMap<>();
        tMap3.put(new ProductModel(1, "Mobile", 1200f), "Electronic");
        tMap3.put(new ProductModel(2, "Laptop", 2500f), "Electronic");
        tMap3.put(new ProductModel(3, "Refrigerator", 1800f), "Home Appliance");
        tMap3.put(new ProductModel(4, "Microwave", 400f), "Home Appliance");
        tMap3.put(new ProductModel(5, "Tablet", 900f), "Electronic");
        tMap3.put(new ProductModel(6, "Washing Machine", 1500f), "Home Appliance");
        tMap3.put(new ProductModel(7, "Headphones", 150f), "Accessories");
        tMap3.put(new ProductModel(8, "Smartwatch", 300f), "Wearable");
        tMap3.put(new ProductModel(9, "Camera", 1300f), "Electronic");
        tMap3.put(new ProductModel(10, "TV", 2000f), "Home Appliance");
        tMap3.put(new ProductModel(1, "Mobile", 1200f), "Electronic");
        tMap3.put(new ProductModel(11, "Mobile", 1200f), "Electronics");

        System.out.println("-------------Key----------------------");
        Set<ProductModel>models=tMap3.keySet();
        System.out.println("Key "+ models); //ClassCastException

    }
}
