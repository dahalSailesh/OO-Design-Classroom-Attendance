package designQuestion;

import java.util.ArrayList;

public interface ClassroomInterface{

	/** takes an object of type Student  */
	public void addStudent(Student student);
	
	/** takes an integer value  */
	public void enterIDForAttendance(int studentID);
	
	/** returns an ArrayList<String> of absent students  */
	public ArrayList<String> getAbsentStudents();
	
	/** returns an ArrayList<String> of present students  */
	public ArrayList<String> getPresentStudents();
	
}
