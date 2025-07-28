package corejava.oops.constructor;

public class Student
{
    public String name;
    public int roll;


    public Student(String name,int roll)
    {
        this.name=name;
        this.roll=roll;

    }

    public void display()
    {
        System.out.println("Student Name : "+ name+"\nRoll No : "+roll);
    }
}
