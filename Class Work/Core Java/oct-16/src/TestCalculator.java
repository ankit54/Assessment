
public class TestCalculator {

	public static void main(String[] args) {
		ScientificCalculator sc=new ScientificCalculator();
		sc.cost=100;
		sc.add();
		sc.sin();
		System.out.println("cost= "+sc.cost);
		System.out.println("...................................");
		Calculator s=new Calculator();
		s.cost=50;
		s.mul();
		System.out.println("cost= "+s.cost);

	}

}
