
public class Demo {
	public static void main(String[] args) {
		//length()
		String s="Ankit";
		System.out.println(s.length());
		
		//== and equals()
		String p="Priya";
		System.out.println(s==p);        //false, "==" compare address in non-primitive
		String k="Priya";
		System.out.println(p==k);        //true ,compare address 
		String m=new String("Priya");
		System.out.println(p==m);        //false , compare address
		System.out.println(p.equals(m)); //true, "equals()" compare contents in non-primitive
		
		//toUpperCase()
		String z="dimple";
		z.toLowerCase();
		System.out.println("z= "+z); //dimple, because there is no variable to hold "DIMPLE" object
		String y=z.toUpperCase();
		System.out.println("y= "+y); //DIMPLE
		
		//trim()
		String n="hello ";
		n.trim();
		System.out.println("hello length= "+n.length());
		String l=n.trim();
		System.out.println("after trim()..... hello length= "+l.length());
		
		
		//charAt(index)
		String c="raju";
		char c1=m.charAt(2);
		System.out.println(c1);
		//char c2=m.charAt(5);
		//System.out.println(c2); // StringIndexOutOfIndexException
		
		//split()
		System.out.println("split() method");
		String msg="hiii hello how are you?";
		String arr[]=msg.split("h");
		for (String x : arr) {
			System.out.println(x);
			}
		
	}
}
