package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Progm_LinkedHashSet_String {

	public static void main(String[] args) {
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("priya");
		hs.add("divya");
		hs.add("aaaa");
		hs.add("bbbb");
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
