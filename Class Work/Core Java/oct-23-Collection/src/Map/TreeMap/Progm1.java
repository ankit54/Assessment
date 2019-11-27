package Map.TreeMap;

import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Progm1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
		hm.put(1, "Ankit");
		hm.put(2, "Ankit");	
		hm.put(3, "Ankit");
		hm.put(12, "Ankit");
		hm.put(10, "Ankit");
		hm.put(22, "Ankit");
		hm.put(101, "Ankit");
		
		Set<Map.Entry<Integer,String>> se=hm.entrySet();
		
		for (Entry<Integer, String> entry : se) {
			System.out.println("key: "+entry.getKey());
			System.out.println("value: "+entry.getValue());
		}
	}

}
