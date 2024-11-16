
package Collegesystem_ds; 

import java.util.*; 

 

public class Collegesystem_ds { 

    public static void main(String[] args) { 

        Scanner scan = new Scanner(System.in); 

 

        int numCourses; 

        do { 

            System.out.println("Enter the number of courses you want:"); 

            numCourses = scan.nextInt(); 

        } while (numCourses <= 0 || numCourses > 20); 

 

        // Create an array of Course objects  

        Course[] courses = new Course[numCourses]; 

        for (int i = 0; i < numCourses; i++) { 

            System.out.println("Enter course name:"); 

            String courseName = scan.next(); 

            System.out.println("Enter this course's ID:"); 

            int id = scan.nextInt(); 

            courses[i] = new Course(id, courseName); 

        } 

 

        System.out.println("Enter the number of students you want:"); 

        int numStudents = scan.nextInt(); 

 

        // Create a linked list of Student objects 

        linked_list<Student> studentsList = new linked_list<>(); 

        for (int i = 0; i < numStudents; i++) { 

            System.out.println("Enter student name:"); 

            String name = scan.next(); 

            System.out.println("Enter student id:"); 

            int id = scan.nextInt(); 

            Student student = new Student(id, name); 

            studentsList.add(student);  

        } 

 

      // Assign courses to students 

node<Student> currentStudent = studentsList.head; 

while (currentStudent != null) { 

    Student student = currentStudent.getData(); 

    System.out.println("Assign courses for student " + student.getStudentName() + " (ID: " + student.getStudentId() + "):"); 

    for (Course course : courses) { 

        System.out.println("Do you want to enroll " + student.getStudentName() + " in " + course.getCourseName() + "? (yes/no)"); 

        String answer = scan.next(); 

        if (answer.equalsIgnoreCase("yes")) { 

            course.enrollStudent(student); 

        } 

    } 

    currentStudent = currentStudent.getNext(); 

    System.out.println(); 

} 

// Print students enrolled in each course 

for (Course course : courses) { 

    System.out.println("Students enrolled in " + course.getCourseName() + ":"); 

     currentStudent = course.getEnrolledStudents().head; 

    while (currentStudent != null) { 

        Student student = currentStudent.getData(); 

        System.out.println(student.getStudentName()); 

        currentStudent = currentStudent.getNext(); 

    } 

    System.out.println(); 

} 

 

// Print courses enrolled by each student 

 currentStudent = studentsList.head; 

while (currentStudent != null) { 

    Student student = currentStudent.getData(); 

    System.out.println("Courses enrolled by " + student.getStudentName() + ":"); 

    node<Course> currentCourse = student.getEnrolledCourses().head; 

    while (currentCourse != null) { 

        Course course = currentCourse.getData(); 

        System.out.println(course.getCourseName()); 

        currentCourse = currentCourse.getNext(); 

    } 

    System.out.println(); 

    currentStudent = currentStudent.getNext(); 

} 

 

    } 

} 
