import java.util.TreeSet;

public class Test_Student implements Comparator_Interface{

	public static void main(String[] args) {
		
		
		
		TreeSet<Student> al=new TreeSet<Student>(Comparator_Interface.comName);
		Student s1=new Student(1,"ank",85.6);
		Student s2=new Student(2,"ank",45.6);
		Student s3=new Student(3,"ank",75.6);
		Student s4=new Student(4,"ank",25.6);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		for (Student student : al) {
			System.out.println(student.id);
			System.out.println(student.name);
			System.out.println(student.percent);
			System.out.println("------------------------------------");
		}


		
		
	}

}
