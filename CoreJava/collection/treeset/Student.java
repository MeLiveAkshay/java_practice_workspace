package collection.treeset;

public class Student  implements Comparable{
   private int rollNo;
	private String name;
	private float percentage;
	
	public Student()
	{
		
	}

    public Student(int rollNo, String name, float percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    

    @Override
    public int compareTo(Object o) {
        /*
        if(o instanceof Student){
            Student s= (Student) o;
            if(this.rollNo> s.rollNo){
                return 1;
            }
            else if(this.rollNo< s.rollNo){
                return -1;
            }
        }
        return 0;
        */

        if(o instanceof Student){
            Student s= (Student) o;
            return this.name.compareTo(s.name);

        }
        return 0;
    }
    

     @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + "]";
    }
}
