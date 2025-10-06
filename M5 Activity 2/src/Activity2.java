import java.util.*;

class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return courseName;
    }

    public void showStudents() {
        System.out.println("Course: " + courseName + " has students: " + students);
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public String toString() {
        return name;
    }

    public void showCourses() {
        System.out.println("Student: " + name + " enrolled in: " + courses);
    }
}

public class Activity2 {
    public static void main(String[] args) {
        Course c1 = new Course("Math");
        Course c2 = new Course("Computer Science");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.enroll(c1);
        s1.enroll(c2);

        s2.enroll(c1);

        s1.showCourses();
        s2.showCourses();

        c1.showStudents();
        c2.showStudents();
    }
}