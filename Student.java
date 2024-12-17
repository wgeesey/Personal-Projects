public class Student {
	private int id, age;
	private String name, grade;

	// Constructor
	public Student(int id, String name, int age, String grade) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	// Getters and Setters
	public int getID() { return id;}
	public void setID(int ID) { this.id = id; }
	public String getName() { return name;}
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age;}
	public String getGrade() { return grade; }
	public void setGrade(String grade) { this.grade = grade; }

	// Display student details
	public void display() {
		System.out.println("ID: " + id + ", Name: " + id + ", Age: " + age +
			", Grade: " + grade);
	}
}