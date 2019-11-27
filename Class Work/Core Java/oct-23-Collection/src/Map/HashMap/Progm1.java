package Map.HashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Progm1 {

	public static void main(String[] args) {
		HashMap<Character, String> hm=new HashMap<Character, String>();
		hm.put('1', "Ankit");
		hm.put('2', "Ankit");	
		hm.put('1', "Ankit");
		hm.put('1', "Ankit");
		
		Set<Map.Entry<Character,String>> se=hm.entrySet();
		
		for (Map.Entry<Character, String> entry : se) {
			System.out.println("key: "+entry.getKey());
			System.out.println("value: "+entry.getValue());
		}
	}

}
