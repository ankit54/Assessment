package program3;

import java.util.Collection;

public class ArrayList1 implements Collection1 {

	@Override
	public Collection returnColl() {
		java.util.ArrayList<Integer> al=new java.util.ArrayList<Integer>();
		al.add(12);
		al.add(50);
		al.add(58);
		return al;
	}


}
