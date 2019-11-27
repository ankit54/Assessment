import java.util.ArrayList;
import java.util.ListIterator;

public class Progm_ListIterator2 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(5);
	al.add(6);
	al.add("ankit");
	al.add(2.8);

	ListIterator it=al.listIterator(al.size()); //here pointer travels to the last index of ArrayList
	
	//backward printing
	while (it.hasPrevious()) {
		Object r2=  it.previous();
		System.out.println(r2);
	}
}
}
