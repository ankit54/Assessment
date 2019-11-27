
public class Test_Factorial {

	public static void main(String[] args) {
		Factorial p=n->{
			int f=1;
			for (int i = 1; i < n; i++) {
				f=f*i;
			}
			return f;
		};
		int y=p.fact(0);
		System.out.println(y);
	}

}
