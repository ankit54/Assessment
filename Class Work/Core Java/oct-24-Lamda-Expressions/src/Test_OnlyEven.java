import java.util.ArrayList;
import java.util.function.Predicate;

public class Test_OnlyEven {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(15);
		al.add(8);
		al.add(14);
		al.add(7);
		ArrayList<Integer> bl=new ArrayList<Integer>();
		
		
		
		for(Integer r:al) {
			if(r%2==0) {
				bl.add(r);
			}
		}
		System.out.println(bl);

	}

}
