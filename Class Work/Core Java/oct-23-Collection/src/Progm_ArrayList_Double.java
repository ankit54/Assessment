import java.util.ArrayList;
import java.util.Collections;

public class Progm_ArrayList_Double {
 public static void main(String[] args) {
	ArrayList<Double> al=new ArrayList<Double>();
	al.add(5.1);
	al.add(6.2);
	al.add(3.6);
	al.add(4.6);
	al.add(2.3);
	//Collections.sort(al);
	//Collections.shuffle(al);
	
	
	System.out.println(al);
	
	ArrayList<Double> bl=new ArrayList<Double>();
	
	bl.add(5.1);
	bl.add(6.0);
	System.out.println(bl);
	
	System.out.println(al.containsAll(bl));
	System.out.println(al.removeAll(bl));
}
}
