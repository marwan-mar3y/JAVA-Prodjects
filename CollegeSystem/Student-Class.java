package Collegesystem_ds; 

 

public class Student { 

    int studentId; 

    String studentName; 

    linked_list<T> enrolledCourses; 

 

    public Student(int studentId, String studentName) { 

        this.studentId = studentId; 

        this.studentName = studentName; 

        this.enrolledCourses = new linked_list(); // Initialize as linked_list 

    } 

 

    public int getStudentId() { 

        return studentId; 

    } 

 

    public String getStudentName() { 

        return studentName; 

    } 

 

    public linked_list getEnrolledCourses() {  

        return enrolledCourses; 

    } 

 

    public void enrollInCourse(Course course) { 

        enrolledCourses.add(course);  

    } 

} 

