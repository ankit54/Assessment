package program6;

public class Student {
	private int id;
	private String name;
	private char gender;
	private double marks;
	public Student(int id, String name, char gender, double marks) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	

}
