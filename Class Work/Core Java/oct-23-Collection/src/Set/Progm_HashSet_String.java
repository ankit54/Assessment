package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Progm_HashSet_String {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("priya");
		hs.add("divya");
		hs.add("aaaa");
		hs.add("bbbb");
		hs.add("cccc");
		
		System.out.println("----------for each--------");
		for (String object : hs) {
			System.out.println(object);
		}
		System.out.println("----------iterator------");
		Iterator<String> i=hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next()); 

		}
	}

}
