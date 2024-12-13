
public class Student {
	private String name;
	private String rollNumber;
	private int age;
	private int marks;
	
	public Student(String name, String rollNumber, int age, int marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.age = age;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + 
													", age=" + age + ", marks=" + marks + "]";
	}

	public String getName() {
		return name;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public int getAge() {
		return age;
	}
	public int getMarks() {
		return marks;
		
	}
}
