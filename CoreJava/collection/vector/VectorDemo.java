package collection.vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Vector;



public class VectorDemo {
    public static void main(String[] args)
	{
		Vector<Integer> vector=new Vector<>();
		vector.addElement(5);//auto-boxing and  with Integer warrap object
		vector.addElement(3);
		vector.addElement(53);
		vector.addElement(54);
		vector.addElement(53);
		vector.addElement(55);
		
		/**
		 * 
		
		for (int i = 0; i<vector.size();i++)
		{
			System.out.print(" "+vector.get(i));
		}
		 */
		
		System.out.println("Vector Element : ");
		
		Enumeration<Integer> enumeration=vector.elements();
		
		while (enumeration.hasMoreElements()) {
			
			/**
			 * 
			 
			Integer integer = (Integer) enumeration.nextElement();
			System.out.print(integer + " ");
			
			*/
			
			System.out.print(enumeration.nextElement()+" ");
			
			
			
		}
		System.out.println();
		System.err.println("Vector capacity : "+vector.capacity());
		System.out.println();
		
		Vector<Employee> vector2=new Vector<Employee>();
		vector2.addElement(new Employee(121, "Geeta", 15000.6f));
		vector2.addElement(new Employee(128, "seeta", 15890.6f));
		vector2.addElement(new Employee(127, "Pankaj", 15025.6f));
		vector2.addElement(new Employee(126, "Pinki", 150089.6f));
		vector2.addElement(new Employee(122, "Ranu", 150001.6f));
		System.out.println("Vector of the Empolyee");
		Enumeration<Employee> enumeration2=vector2.elements();
		while (enumeration2.hasMoreElements()) {
			Employee employee = (Employee) enumeration2.nextElement();
			System.out.println(employee+" ");
			
		}
		


		//convert into one collection to another collection

		ArrayList <Integer> list =new ArrayList<>(vector);
		System.out.println("after convert : "+list);
		

		LinkedHashSet<Integer> set=new LinkedHashSet<>(list);
		System.out.println("unique Element : "+set);
	}
}
