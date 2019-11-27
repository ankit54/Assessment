import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Progm_ListIterator {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(6);
		al.add("ankit");
		al.add(2.8);

		ListIterator it=al.listIterator();
		
		//backward printing
		System.out.println("-----------forward--------------");
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);

		}
		
		//backward printing
		System.out.println("-----------backward--------------");
		while (it.hasPrevious()) {
			Object r2=  it.previous();
			System.out.println(r2);
		}
	}

}
