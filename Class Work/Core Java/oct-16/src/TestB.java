
public class TestB {
	public static void main(String[] args) {
		Van p=new Van();
		p.cost=100;
		p.model="i10"; 
		p.move();
		p.stop();
		System.out.println(p.cost);
		System.out.println(p.model);
	}
}
