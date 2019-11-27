import java.util.function.Function;

public class Test_Function2 {

	public static void main(String[] args) {
		Student s1=new Student(1,"Ankit",35.0);
		
		Function<Student,Student> fn=s->{
			s.percent=s.percent+5;
			return s;
		};
		Student s2=fn.apply(s1);
		System.out.println(s2.id+" "+s2.name+" "+s2.percent);

	}

}
