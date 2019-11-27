
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Progm_LinkedList {
	
	public static void main(String[] args) {
		
		System.out.println("-----Program of LinkedList using for(),foreach(),Iterator,ListIterator-------\n");
		
		LinkedList li=new LinkedList();
		li.add(2.4);
		li.add(5.8);
		li.add(3.6);
		li.add(4.1);
		
		System.out.println("-----------forward using for() loop--------------");
		for (int i = 0; i <li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println("-----------forward using for-each() loop--------------");
		for (Object ele : li) {
			System.out.println(ele);
		}
		
		Iterator<Double> i1=li.iterator();
		
		//forward printing using iterator
		System.out.println("-----------forward using iterator--------------");
		while (i1.hasNext()) {
			Double num = i1.next();
			System.out.println(num);

		}

		ListIterator<Double> i2=li.listIterator();
		
		//forward printing using ListIterator
		System.out.println("-----------forward using ListIterator--------------");
		while (i2.hasNext()) {
			Double num =  i2.next();
			System.out.println(num);

		}
		
		//backward printing using ListIterator
		System.out.println("-----------backward using ListIterator--------------");
		while (i2.hasPrevious()) {
			Double num = i2.previous();
			System.out.println(num);
		}
	}

}
