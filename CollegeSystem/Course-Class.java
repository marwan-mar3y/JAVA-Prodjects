
package Collegesystem_ds; 

 

public class Course { 

    private int courseId; 

    private String courseName; 

    private linked_list<Student> enrolledStudents;  

 

    public Course(int courseId, String courseName) { 

        this.courseId = courseId; 

        this.courseName = courseName; 

        this.enrolledStudents = new linked_list<>();  

    } 

 

    public int getCourseId() { 

        return courseId; 

    } 

 

    public String getCourseName() { 

        return courseName; 

    } 

 

    public linked_list<Student> getEnrolledStudents() { // Change the return type 

        return enrolledStudents; 

    } 

 

    public void enrollStudent(Student student) { 

        enrolledStudents.add(student); // Add the student to the linked list 

        student.enrollInCourse(this); 

    } 

} 

