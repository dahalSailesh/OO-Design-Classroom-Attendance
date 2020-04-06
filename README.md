# OODesignQuestion Writeup

Q2:
    In a specific high school, students have to swipe their IDs when they come to class in order to take
    attendance. The ID numbers are converted to names and then stored. If a student swipes more than
    once in a day, the system only stores their name once. At the end of the day, the teachers check the
    results to see who came to class and who didn’t. Design a system to keep track of attendance. Note
    that the machine that helps people swipe to take attendance takes ID numbers as its input.

I didn't find any challenges in understanding the problem description. I did however had to return to change the blueprint of my Classroom class because I overlooked these lines: "who came to class and who didn't." Initially, I was returning only the students who were absent. I changed the class to include methods that return both the absent and present students.

For this problem, I created a Classroom class that would take in Student object(s). A Student object has two attributes: studentName and studentID. I added the students to a HashMap with their values set to 'false' in the Classroom class, considering the students as absent upon enrolling in the class. Their values are changed to 'true' when they swipe their IDs.
