package oops;


public class ClassName
{
    public static int number;
    public static String name;

    public static void display()
    {
        System.out.println("Number : "+number +" Name : "+name);
    }
    public static void main(String[] args) {
        number=10;
        name="Shardha";
        display();
    }

}
