package program3;

import java.util.Collection;
import java.util.Vector;

public class Vector1 implements Collection1 {

	@Override
	public Collection returnColl() {
		 Vector v = new Vector(); 
		  
	        v.add(1); 
	        v.add(2); 
	        v.add("Ankit"); 
	        v.add("Singh"); 
	        v.add(3); 
	  
		return v;
	}

}
