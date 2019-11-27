package Map.LinkedHashMap;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Progm1 {

	public static void main(String[] args) {
		LinkedHashMap<Character, String> hm=new LinkedHashMap<Character, String>();
		hm.put('1', "Ankit");
		hm.put('2', "Ankit");	
		hm.put('3', "Ankit");
		hm.put('4', "Ankit");
		
		Set<Map.Entry<Character,String>> se=hm.entrySet();
		
		for (Map.Entry<Character, String> entry : se) {
			System.out.println("key: "+entry.getKey());
			System.out.println("value: "+entry.getValue());
		}
	}

}
