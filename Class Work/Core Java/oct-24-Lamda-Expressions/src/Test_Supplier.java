import java.util.function.Supplier;

public class Test_Supplier {

	public static void main(String[] args) {
		Supplier<Student> fn= ()-> new Student(1, "dimple", 56.8);
		Student s=fn.get();
		System.out.println(s.name);
	}

}
