package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Progm_LinkedHashSet {
public static void main(String[] args) {
	LinkedHashSet hs=new LinkedHashSet();
	hs.add("priya");
	hs.add("divya");
	hs.add("aaaa");
	hs.add("bbbb");
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
