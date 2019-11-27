
public class Database {
	void save(Student s) {
		System.out.println("saving");
		System.out.println(s.getId());
		System.out.println(s.getName());
	}
	void save(Employee e) {
		System.out.println("saving");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getGender());
		System.out.println(e.getHeight());
	}
	
	
}
