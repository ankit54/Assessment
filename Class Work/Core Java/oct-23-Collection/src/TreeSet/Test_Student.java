package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;
public class Test_Student {

	public static void main(String[] args) {
		//Student_CompareByID id=new Student_CompareByID();
		Student_CompareByName comName=new Student_CompareByName();
		TreeSet<Student> ts=new TreeSet<Student>(comName);
		Student p1=new Student(1,"Anki",653.6);
		Student p2=new Student(2,"Ankita",653.6);
		Student p3=new Student(0,"Ankitaa",653.6);
		Student p4=new Student(4,"bnkit",653.6);

		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		
		Iterator<Student> i=ts.iterator();
		while (i.hasNext()) {
			Student student = (Student) i.next();
			System.out.println(student.id);
			System.out.println(student.name);
			System.out.println(student.percent);
			System.out.println("......................");
		}
	}

}
