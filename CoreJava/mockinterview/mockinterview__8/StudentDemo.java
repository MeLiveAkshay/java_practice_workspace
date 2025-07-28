package mockinterview.mockinterview__8;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student(5, "Akshay");


        try{
            FileOutputStream  fileOutputStream=new FileOutputStream("student.txt");
            ObjectInputStream  objectOutput=new ObjectInputStream(fileOutputStream);

            ((FileOutputStream) objectOutput).write(student);  
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }
}
