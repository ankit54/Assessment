package Set;

import java.util.TreeSet;

public class Progm_TreeSet_String {

	public static void main(String[] args) {
TreeSet<String> hs=new TreeSet<String>();
		
		
		hs.add("A");
		hs.add("b");
		hs.add("a");
		hs.add("Kunal");
		hs.add("Pavitra");
		hs.add("Kartik");
		
		for (String person : hs) {
			
			System.out.println(person);
			
			//System.out.println("................................");
		}
	}

}
