import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test_Student_ArrayList {
	
	public static void main(String[] args) {
		System.out.println("-----Program of ArrayList using for(),foreach(),Iterator,ListIterator-------\n");
ArrayList<Student> al=new ArrayList<Student>();
Student s1=new Student(1,"ank",85.6);
Student s2=new Student(2,"ank",45.6);
Student s3=new Student(3,"ank",75.6);
Student s4=new Student(4,"ank",25.6);

al.add(s1);
al.add(s2);
al.add(s3);
al.add(s4);
 

for (int i = 0; i < al.size(); i++) {
	Student s=al.get(i);
	System.out.println("student "+i);
	System.out.println(s.id);
	System.out.println(s.name);
	System.out.println(s.percent);
	System.out.println("------------------------------------");
}

for (Student student : al) {

	System.out.println(student.id);
	System.out.println(student.name);
	System.out.println(student.percent);
	System.out.println("------------------------------------");
}

Iterator<Student> i1=al.iterator();
while (i1.hasNext()) {
	Student s =  i1.next();
	
	
	System.out.println(s.id);
	System.out.println(s.name);
	System.out.println(s.percent);
	System.out.println("------------------------------------");

}

ListIterator<Student> i2=al.listIterator();
int count=0;
while (i2.hasNext()) {
	Student s =  i2.next();
	
	System.out.println("student "+ ++count);
	System.out.println(s.id);
	System.out.println(s.name);
	System.out.println(s.percent);
	System.out.println("------------------------------------");

}
count=0;
while (i2.hasPrevious()) {
	Student s =  i2.previous();
	
	System.out.println("student "+ ++count);
	System.out.println(s.id);
	System.out.println(s.name);
	System.out.println(s.percent);
	System.out.println("------------------------------------");

}

	}

}
