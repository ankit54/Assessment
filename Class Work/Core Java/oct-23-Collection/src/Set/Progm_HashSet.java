package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Progm_HashSet {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("priya");
		hs.add("divya");
		hs.add(1);
		hs.add('M');
		hs.add(null);
		System.out.println("----------for each--------");
		for (Object object : hs) {
			System.out.println(object);
		}
		System.out.println("----------iterator------");
		Iterator i=hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next()); 

		}


	}

}
