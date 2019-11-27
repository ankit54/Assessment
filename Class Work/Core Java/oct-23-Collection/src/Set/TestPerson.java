package Set;

import java.util.HashSet;

public class TestPerson {

	public static void main(String[] args) {
		HashSet<Person> hs=new HashSet<Person>();
		
		Person p1=new Person(1, "Ankit", 65.1); 
		Person p2=new Person(1, "Ankit", 65.1); 
		Person p3=new Person(2, "Ankit", 65.1); 
		Person p4=new Person(3, "Ankit", 65.1); 
		
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		
		for (Person person : hs) {
			
			System.out.println(person.id);
			System.out.println(person.name);
			System.out.println(person.height);
			System.out.println("................................");
		}
	}

}
