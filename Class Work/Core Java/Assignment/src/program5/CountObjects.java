package program5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import program1.Animal;
import program1.Cow;
import program1.Lion;

public class CountObjects {
		
	private static void count(List<Animal> li) {
		int c=0,l=0;
		for (Animal animal : li) {
			if (animal instanceof Cow) {
				c++;
			}else {
				l++;
			}
		}
		System.out.println("cow: "+c+" lion: "+l);
	}
	public static void main(String[] args) {
		Animal c1=new Cow();
		Animal c2=new Cow();
		Animal l1=new Lion();
		Animal l2=new Lion();
		Animal l3=new Lion();
		
		List<Animal> al=new ArrayList<Animal>();
		al.add(c1);
		al.add(c2);
		al.add(l1);
		al.add(l2);
		al.add(l3);
		
		count(al);
}
}