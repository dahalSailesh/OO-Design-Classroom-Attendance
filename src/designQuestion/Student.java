package designQuestion;

public class Student {
	private String studentName;
	private int studentID;
	
	// Constructor	
	public Student(String name, int id) {
		this.studentName = name;
		this.studentID = id;
	}
	
	/** return a String  */
	public String getName() {
		return this.studentName;
	}
	
	/** return an integer  */
	public int getID() {
		return this.studentID;
	}
}
