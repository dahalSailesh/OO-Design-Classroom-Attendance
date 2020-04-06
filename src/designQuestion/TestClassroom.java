package designQuestion;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;


public class TestClassroom {
	
	@Test
	 public void testAddStudent() {
        Classroom testClassroom = new Classroom();
    	
    	Student sailesh = new Student("sailesh", 723079);
		Student sijal = new Student("sijal", 923077);
		
		testClassroom.addStudent(sailesh);
		testClassroom.addStudent(sijal);

		assertEquals(2, testClassroom.countClassStudents());
		
		Student amit = new Student("amit", 824279);
		testClassroom.addStudent(amit);
		
		assertEquals(3, testClassroom.countClassStudents());
		
    }
	
	@Test
	public void testGetAbsentStudents() {
	    Classroom testClassroom = new Classroom();
	    
    	Student sailesh = new Student("sailesh", 723079);
		Student sijal = new Student("sijal", 923077);
		Student amit = new Student("amit", 824279);
		
		testClassroom.addStudent(sailesh);
		testClassroom.addStudent(sijal);
		testClassroom.addStudent(amit);
		
		testClassroom.enterIDForAttendance(sailesh.getID());
		testClassroom.enterIDForAttendance(amit.getID());
		
		ArrayList<String> absentStudentsList = testClassroom.getAbsentStudents();
		
		assertEquals("sijal", absentStudentsList.get(0));
		assertEquals(1, absentStudentsList.size());
	    
	}
	
	@Test
	public void testAllStudentsAbsent() {   				// debating if this instance of the test should be in testGetAbsentStudents
	    Classroom testClassroom = new Classroom();
	    
    	Student sailesh = new Student("sailesh", 723079);
		Student sijal = new Student("sijal", 923077);
		Student amit = new Student("amit", 824279);
		
		testClassroom.addStudent(sailesh);
		testClassroom.addStudent(sijal);
		testClassroom.addStudent(amit);
	
		ArrayList<String> absentStudentsList = testClassroom.getAbsentStudents();
		
		assertEquals("sailesh", absentStudentsList.get(0));
		assertEquals(3, absentStudentsList.size());			// all students are absent
	}
	
	@Test
	public void testGetPresentStudents() {
	    Classroom testClassroom = new Classroom();
	    
    	Student sailesh = new Student("sailesh", 723079);
		Student sijal = new Student("sijal", 923077);
		Student amit = new Student("amit", 824279);
		
		testClassroom.addStudent(sailesh);
		testClassroom.addStudent(sijal);
		testClassroom.addStudent(amit);
		
		testClassroom.enterIDForAttendance(sailesh.getID());
		testClassroom.enterIDForAttendance(amit.getID());
		
		ArrayList<String> presentStudentsList = testClassroom.getPresentStudents();
		
		assertEquals("sailesh", presentStudentsList.get(0));
		assertEquals("amit", presentStudentsList.get(1));
		
	}
}
