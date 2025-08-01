package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;



public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(56);
        set.add(58);
        set.add(85);
        set.add(85);
        set.add(82);
        set.add(23);
        System.out.println("---------- Integer Tree Element ------------------");
        System.out.println("Element : "+ set);



        System.out.println("--------------------------------------------------");
        TreeSet<String> set2=new TreeSet<>();
        set2.add("Hello");
        set2.add("bye");
        set2.add("collection");
        set2.add("Welcome");
        set2.add("Hello");
        set2.add("hey");

        System.out.println("String Tree Set Element : "+set2);

        System.out.println("--------------------------------------------------");
        TreeSet<Student> studentSet = new TreeSet<>(new StudentComparator());
        studentSet.add(new Student(102, "Rahul", 85.5f));
        studentSet.add(new Student(101, "Anita", 90.2f));
        studentSet.add(new Student(103, "Suresh", 78.0f));
        studentSet.add(new Student(105, "Neha", 92.1f));
        studentSet.add(new Student(104, "Amit", 80.6f));
        
        
        
        Iterator<Student> iterator=studentSet.iterator();
        System.out.println("1st Student TreeSet Element : ");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

        System.out.println("--------------------------------------------------");
        TreeSet<Student> studentSet2 = new TreeSet<Student>();
        studentSet2.add(new Student(102, "Rahul", 85.5f));
        studentSet2.add(new Student(101, "Anita", 90.2f));
        studentSet2.add(new Student(103, "Suresh", 78.0f));
        studentSet2.add(new Student(105, "Neha", 92.1f));
        studentSet2.add(new Student(104, "Amit", 80.6f));
        
        
        
        Iterator<Student> iterator2=studentSet2.iterator();
        System.out.println("2nd Student TreeSet Element (Sorted by Name) : ");
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}

    }
}
