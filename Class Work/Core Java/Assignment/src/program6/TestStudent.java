package program6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class TestStudent {
public static void main(String[] args) {
	Student s1=new Student(1, "Ankit", 'M', 85.6);
	Student s2=new Student(2, "Kunal", 'M', 95.6);
	Student s3=new Student(3,"Aditi",'F',96.8);
	Student s4=new Student(4, "Pari", 'F', 75.2);
	
	List<Student> li=new ArrayList<Student>();
	li.add(s1);
	li.add(s2);
	li.add(s3);
	li.add(s4);
	
	
	 Student minByAge = li
		      .stream()
		      .max(Comparator.comparing(Student::getGender))
		      .orElseThrow(NoSuchElementException::new);
	 
	 System.out.println(minByAge.getMarks());
	
}
}
