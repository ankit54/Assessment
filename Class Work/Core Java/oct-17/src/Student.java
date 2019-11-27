
public class Student {
	int id;
	String name;
	double percent;
	public Student(int id, String name, double percent) {
		this.id = id;
		this.name = name;
		this.percent = percent;
	}
	void display() {
		System.out.println("ID is "+id);
		System.out.println("NAME is "+name);
		System.out.println("PERCENTAGE is "+percent);
	}
}
