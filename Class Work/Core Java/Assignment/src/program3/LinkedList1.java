package program3;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedList1 implements Collection1 {

	@Override
	public Collection returnColl() {
		LinkedList li=new LinkedList();
		li.add(2.4);
		li.add(5.8);
		li.add(3.6);
		li.add(4.1);
		return li;
	}

}
