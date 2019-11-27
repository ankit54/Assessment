
public class TestPerson {

	public static void main(String[] args) {
		Person p=new Person();
		System.out.println("person age= "+p.age);
		System.out.println("mobile model= "+p.m.model);
		p.walk();
		p.m.doCall();

	}

}
