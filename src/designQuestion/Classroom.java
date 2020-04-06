package designQuestion;

import java.util.LinkedHashMap;
import java.util.ArrayList;

public class Classroom implements ClassroomInterface {	
	private LinkedHashMap<Student, Boolean> studentMap; 						// a LinkedHashMap to maintain insertion order
	private ArrayList<String> absentStudents;
	private ArrayList<String> presentStudents;
	private int count;

	// Constructor
	public Classroom() {
		this.studentMap = new LinkedHashMap<Student, Boolean>();
		this.count = 0;
		this.absentStudents = new ArrayList<String>();
		this.presentStudents = new ArrayList<String>();
	}

	
	public void addStudent(Student student) {
		this.studentMap.put(student, false);
		this.count++;
	}
	
	public void enterIDForAttendance(int studentID) {
		for (Student student : this.studentMap.keySet()) {
			int iD = student.getID();
			if (iD == studentID) {
				this.studentMap.put(student, true);
				return;
			}
		}
	}
	
	public int countClassStudents() {
		return this.count;
	}

	private void takeAttendance() {
		for (Student student : this.studentMap.keySet()) {
			boolean isPresent = studentMap.get(student);
			if (!isPresent) {
				this.absentStudents.add(student.getName());
			}
			else {
				this.presentStudents.add(student.getName());
			}
		}
	}
	
	public ArrayList<String> getPresentStudents() {
		this.takeAttendance();
		return this.presentStudents;
	}
	
	public ArrayList<String> getAbsentStudents(){
		this.takeAttendance();
		return this.absentStudents;
	}

}
