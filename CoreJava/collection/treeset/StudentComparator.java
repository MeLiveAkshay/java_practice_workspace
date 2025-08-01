package collection.treeset;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    

    @Override
    public int compare(Student o1, Student o2) {
        if(o1 instanceof Student && o2 instanceof Student)
		{
			Student student1=(Student) o1;
			Student student2=(Student) o2;
			
			
			if(student1.getRollNo() > student2.getRollNo())
			{
				return 1;
			}
			else if (student1.getRollNo() < student2.getRollNo())
			{
				return -1;
			}
			
			
			return ((Student) o1).getRollNo()-((Student) o2).getRollNo();
		}
        return 0;
    }

}
