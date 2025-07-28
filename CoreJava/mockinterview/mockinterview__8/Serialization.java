package mockinterview.mockinterview__8;

import java.io.ObjectOutput;

public class Serialization {
    @SuppressWarnings("unused")
    private static int empId=1;
    @SuppressWarnings("unused")
    private static String name = "Akshay";
    @SuppressWarnings("unused")
    private static float salary=15032.8f;
    public static void main(String[] args) {
        ObjectOutput objectOutput=new ObjectOutput(empId,name,salary);

        System.out.println(objectOutput);
    }
}
