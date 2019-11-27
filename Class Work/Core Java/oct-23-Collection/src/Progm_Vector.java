import java.util.Iterator;
import java.util.Vector;
import java.util.ListIterator;

public class Progm_Vector {

	public static void main(String[] args) {
		System.out.println("-----Program of Vector using for(),foreach(),Iterator,ListIterator-------\n");

		Vector li=new Vector();
		li.add('A');
		li.add(2.4 );
		li.add(15);
		li.add("Deepa");

		System.out.println("-----------forward using for() loop--------------");
		for (int i = 0; i <li.size(); i++) {
			System.out.println(li.get(i));
		}

		System.out.println("-----------forward using for-each() loop--------------");
		for (Object ele : li) {
			System.out.println(ele);
		}

		Iterator i1=li.iterator();

		//forward printing using iterator
		System.out.println("-----------forward using iterator--------------");
		while (i1.hasNext()) {
			Object num =  i1.next();
			System.out.println(num);

		}

		ListIterator i2=li.listIterator();

		//forward printing using ListIterator
		System.out.println("-----------forward using ListIterator--------------");
		while (i2.hasNext()) {
			Object num =   i2.next();
			System.out.println(num);

		}

		//backward printing using ListIterator
		System.out.println("-----------backward using ListIterator--------------");
		while (i2.hasPrevious()) {
			Object num =  i2.previous();
			System.out.println(num);
		}
	}

}
