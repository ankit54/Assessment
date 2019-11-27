import java.util.function.Predicate;

public class Test_Predicate {

	public static void main(String[] args) {
		Student st=new Student(1,"Ankit",56.8);
		Predicate<Student> ps=s->{
			if(s.percent > 35) {
				return true;
			}else {
				return false;
			}
		};
		boolean ans=ps.test(st);
		System.out.println("result is "+ans);
	}//end of main()
}//end of class
