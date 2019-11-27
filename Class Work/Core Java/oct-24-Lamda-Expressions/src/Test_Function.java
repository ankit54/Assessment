import java.util.function.Function;
import java.util.function.Predicate;

public class Test_Function {

	public static void main(String[] args) {
		String name="Priya";
		Function<String, Integer> fn=x->x.length();
		int len=fn.apply(name);
		System.out.println("length is "+len);
	}//end of main()
}
