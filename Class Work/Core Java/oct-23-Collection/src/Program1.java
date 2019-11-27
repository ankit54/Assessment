import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args)  {
			ArrayList al=new ArrayList();
			al.add(5);
			al.add(6);
			al.add("ankit");
			al.add(2.8);
			
			
			for (int i = 0; i < al.size(); i++) {
				Object r=al.get(i);
				System.out.println(al.get(i));
			}
			
			for (Object r : al) {
				System.out.println(r);
			}
			
			
			
	}

}
