
public class TestDatabase {

	public static void main(String[] args) {
		Student s=new Student();
		s.setId(1);
		s.setName("ankit");
		Database d=new Database();
		d.save(s);
	}

}
