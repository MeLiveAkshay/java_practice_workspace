package mockinterview.mockinterview__6;

public class StudentMain {
    public static void main(String[] args) {
        Student student=new Student(12, "Akshay", "cse");
        System.out.println("Student : "+student.hashCode());//hashcode : 622488023


        //after override hashcode method in Student Class
        System.out.println("Student : "+student.hashCode());//Student : 12


        System.out.println(student.toString());
    }
}
