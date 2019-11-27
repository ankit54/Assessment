
public class TestEmployee {

	public static void main(String[] args) {
Employee e=new Employee();

e.setId(1);
e.setName("ankit");
e.setGender('M');
e.setHeight(173.5);
Database d=new Database();
d.save(e);
	}

}
