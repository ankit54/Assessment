import java.util.ArrayList;
import java.util.ListIterator;

public class Progm_GenericListIterator {

	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(2.4);
		al.add(5.8);
		al.add(3.6);
		al.add(4.1);

		ListIterator<Double> i=al.listIterator();
		
		//forward printing
		System.out.println("-----------forward--------------");
		while (i.hasNext()) {
			Double num = (Double) i.next();
			System.out.println(num);

		}
		
		//backward printing
		System.out.println("-----------backward--------------");
		while (i.hasPrevious()) {
			Double num = (Double) i.previous();
			System.out.println(num);
		}
	}

}
