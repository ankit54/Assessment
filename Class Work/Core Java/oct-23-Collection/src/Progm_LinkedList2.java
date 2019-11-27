import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Progm_LinkedList2 {

	public static void main(String[] args) {
		System.out.println("-----Program of LinkedList using for(),foreach(),Iterator,ListIterator-------\n");

		LinkedList<String> li=new LinkedList<String>();
		li.add("ankit 0");
		li.add("ankit 1");
		li.add("ankit 2");
		li.add("ankit 3");

		System.out.println("-----------forward using for() loop--------------");
		for (int i = 0; i <li.size(); i++) {
			System.out.println(li.get(i));
		}

		System.out.println("-----------forward using for-each() loop--------------");
		for (String ele : li) {
			System.out.println(ele);
		}

		Iterator<String> i1=li.iterator();

		//forward printing using iterator
		System.out.println("-----------forward using iterator--------------");
		while (i1.hasNext()) {
			String num =  i1.next();
			System.out.println(num);

		}

		ListIterator<String> i2=li.listIterator();

		//forward printing using ListIterator
		System.out.println("-----------forward using ListIterator--------------");
		while (i2.hasNext()) {
			String num =   i2.next();
			System.out.println(num);

		}

		//backward printing using ListIterator
		System.out.println("-----------backward using ListIterator--------------");
		while (i2.hasPrevious()) {
			String num =  i2.previous();
			System.out.println(num);
		}
	}

}
