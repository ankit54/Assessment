package Set;

import java.util.TreeSet;

public class Progm_TreeSet {

	public static void main(String[] args) {
TreeSet hs=new TreeSet();
		
		
		hs.add(2.3);
		hs.add(5.2);
		hs.add(1.5);
		hs.add(4.55);
		hs.add(0.0);
		
		for (Object person : hs) {
			
			System.out.println(person);
			
			System.out.println("................................");
		}
	}

}
