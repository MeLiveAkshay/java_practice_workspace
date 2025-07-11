package objectClass;


public class ObjectClassDemo {

    /**
     * hashCode(): //def
     * @param args
     */
    public static void main(String[] args) {
        Employee employee=new Employee(12, "Akshay", 123456.21f);
        System.out.println(employee.hashCode());//
    }
}
