package assignment.assignment__11.problem__1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListProblem {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ListProblem listProblem=new ListProblem();
        list.add(55);
        list.add(56);
        list.add(45);
        list.add(23);
        list.add(98);

        System.out.println("Original ArrayList ");
        System.out.println(list);

        listProblem.printArrayList(list);
        //remove elememt by the position
        list.remove(2);
        System.out.println("After Deleting the specific index");
        listProblem.printArrayList(list);

        System.out.println("Search for an element");
        listProblem.seachElement(list,55);
        System.out.println("Ascending Order");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Descending Order");
        Collections.reverse(list);
        System.out.println(list);


    }

    

    public  void  seachElement(ArrayList<Integer> list,Integer a) {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==a)
            {
                System.out.println("Index at :  "+i);
            }
        }
        System.out.println();
    }

    public  void printArrayList(ArrayList<Integer> list) {
        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }
    
}
