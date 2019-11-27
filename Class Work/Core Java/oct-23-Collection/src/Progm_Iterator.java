import java.util.ArrayList;
import java.util.Iterator;

public class Progm_Iterator {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(6);
		al.add("ankit");
		al.add(2.8);

		Iterator it=al.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);

		}
	}

}
