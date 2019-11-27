package Set;

import java.util.TreeSet;

public class Test_TreeSet_Person2 {

	public static void main(String[] args) {
		TreeSet<Person2> hs=new TreeSet<Person2>();
		Person2 p1=new Person2(1,"Anki",653.6);
		Person2 p2=new Person2(2,"Ankita",653.6);
		Person2 p3=new Person2(0,"Ankitaa",653.6);
		Person2 p4=new Person2(4,"bnkit",653.6);

		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);

		for (Person2 person : hs) {

			System.out.println(person.id);
			System.out.println(person.name);
			System.out.println(person.height);

			System.out.println("................................");
		}

	}

}
