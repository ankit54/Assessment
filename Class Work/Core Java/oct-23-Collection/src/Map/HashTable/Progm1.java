package Map.HashTable;


import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Progm1 {

	public static void main(String[] args) {
		Hashtable<Character, String> hm=new Hashtable<Character, String>();
		hm.put('A', "Ankit");
		hm.put('c', "Ankit");	
		hm.put('d', "Ankit");
		hm.put('X', "Ankit");
		hm.put('Q', "Ankit");
		hm.put('g', "Ankit");

		Set<Map.Entry<Character,String>> se=hm.entrySet();

		for (Map.Entry<Character, String> entry : se) {
			System.out.println("key: "+entry.getKey());
			System.out.println("value: "+entry.getValue());
		}

		System.out.println("............................");
		
		
		Hashtable<Integer, String> hm1=new Hashtable<Integer, String>();
		hm1.put(1, "Ankit");
		hm1.put(2, "Ankit");	
		hm1.put(12, "Ankit");
		hm1.put(10, "Ankit");
		hm1.put(5, "Ankit");
		Set<Map.Entry<Integer,String>> se1=hm1.entrySet();

		for (Map.Entry<Integer, String> entry1 : se1) {
			System.out.println("key: "+entry1.getKey());
			System.out.println("value: "+entry1.getValue());
		}
	}

}
