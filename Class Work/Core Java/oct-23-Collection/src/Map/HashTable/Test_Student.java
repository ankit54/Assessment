package Map.HashTable;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Test_Student {

	public static void main(String[] args) {

		Hashtable<String, ArrayList<Student>> hm=new Hashtable<String, ArrayList<Student>>();

		ArrayList<Student> al1=new ArrayList<Student>();
		Student s1=new Student(1, "Ankit", 25.3);
		Student s2=new Student(2, "Ankit", 25.3);
		Student s3=new Student(3, "Ankit", 25.3);
		Student s4=new Student(4, "Ankit", 25.3);
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		al1.add(s4);
		hm.put("class 1",al1);

		ArrayList<Student> al2=new ArrayList<Student>();
		Student s11=new Student(1, "Ankit", 25.3);
		Student s22=new Student(2, "Ankit", 25.3);
		al2.add(s11);
		al2.add(s22);
		hm.put("class 2",al2);


		ArrayList<Student> al3=new ArrayList<Student>();
		Student s111=new Student(1, "Ankit", 25.3);
		Student s222=new Student(2, "Ankit", 25.3);
		Student s333=new Student(3, "Ankit", 25.3);
		al3.add(s111);
		al3.add(s222);
		al3.add(s333);
		hm.put("class 3",al3);


		Set<Entry<String, ArrayList<Student>>> se=hm.entrySet();

		for (Entry<String, ArrayList<Student>> entry : se) {
			System.err.println(entry.getKey());
			ArrayList<Student> al=entry.getValue();
			for (Student array_entry2 : al) {
				System.out.println("ID: "+array_entry2.id);
				System.out.println("NAME: "+array_entry2.name);
				System.out.println("PERCENT: "+array_entry2.percent);
				System.out.println();
			}
			System.out.println(".................................");
		}
	}

}
