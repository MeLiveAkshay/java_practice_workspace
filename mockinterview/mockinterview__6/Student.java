package mockinterview.mockinterview__6;

public class Student {
    private int studentRoll;
    private String studentName;
    private String branch;
    public Student() {
    }

    
    public Student(int studentRoll, String studentName, String branch) {
        this.studentRoll = studentRoll;
        this.studentName = studentName;
        this.branch = branch;
    }


    public int getStudentRoll() {
        return studentRoll;
    }
    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }




    //hashcode method 
   /* 
   
    @Override
    public int hashCode()
    {
        return studentRoll;
    }

    */


    public String toString() {
        return "{\n" +
                "  \"roll no\": " + studentRoll + ",\n" +
                "  \"name\": \"" + studentName + "\",\n" +
                "  \"branch\": " + branch + "\n" +
                "}";
    }
    
}
