package practics.collection_framework.map;

import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<ProductModel,String>map=new TreeMap<>();
        map.put(new ProductModel(1, "Mobile", 1200f), "Electronic");
        map.put(new ProductModel(2, "Laptop", 2500f), "Electronic");
        map.put(new ProductModel(3, "Refrigerator", 1800f), "Home Appliance");
        map.put(new ProductModel(4, "Microwave", 400f), "Home Appliance");
        map.put(new ProductModel(5, "Tablet", 900f), "Electronic");
        map.put(new ProductModel(6, "Washing Machine", 1500f), "Home Appliance");
        map.put(new ProductModel(7, "Headphones", 150f), "Accessories");
        map.put(new ProductModel(8, "Smartwatch", 300f), "Wearable");
        map.put(new ProductModel(9, "Camera", 1300f), "Electronic");
        map.put(new ProductModel(10, "TV", 2000f), "Home Appliance");
        map.put(new ProductModel(1, "Mobile", 1200f), "Electronic");
        map.put(new ProductModel(11, "Mobile", 1200f), "Electronics");



        System.out.println("---------------------------------------------------");
        System.out.println(map);

        System.out.println();
        System.out.println("---------------------------------------------");


        Set<ProductModel> models=map.keySet();
        System.out.println("Key : "+models);

        System.out.println("--------------------------------------------");
        Iterator<ProductModel>iterator=models.iterator();

        while (iterator.hasNext()) {
            ProductModel model=iterator.next();
            System.out.println(model+" is : "+map.get(model));
        }
        
        System.out.println("----------------------------------------");
        System.out.println("Sorted by Name: ");
        TreeMap<ProductModel,String>map2=new TreeMap<>(new ProductComparator());
        map2.put(new ProductModel(1, "Mobile", 1200f), "Electronic");
        map2.put(new ProductModel(3, "Refrigerator", 1800f), "Home Appliance");
        map2.put(new ProductModel(4, "Microwave", 400f), "Home Appliance");
        map2.put(new ProductModel(2, "Laptop", 2500f), "Electronic");
        map2.put(new ProductModel(5, "Tablet", 900f), "Electronic");
        map2.put(new ProductModel(6, "Washing Machine", 1500f), "Home Appliance");
        map2.put(new ProductModel(7, "Headphones", 150f), "Accessories");
        map2.put(new ProductModel(8, "Smartwatch", 300f), "Wearable");
        map2.put(new ProductModel(9, "Camera", 1300f), "Electronic");
        map2.put(new ProductModel(10, "TV", 2000f), "Home Appliance");
        map2.put(new ProductModel(1, "Mobile", 1200f), "Electronic");
        map2.put(new ProductModel(11, "Mobile", 1200f), "Electronics");


        Set<ProductModel> models2=map2.keySet();
        System.out.println("Key : "+models2);

        System.out.println("--------------------------------------------");
        Iterator<ProductModel>iterator2=models2.iterator();

        while (iterator2.hasNext()) {
            ProductModel model2=iterator2.next();
            System.out.println(model2+" is : "+map2.get(model2));
        }
    }
}
