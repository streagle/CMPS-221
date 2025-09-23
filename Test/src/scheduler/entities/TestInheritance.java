// File: scheduler/TestInheritance.java
package scheduler.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestInheritance {
    public static void main(String[] args) {
        Assignment a1 = new Assignment("Project Report", LocalDate.of(2025, 9, 25),
                LocalTime.of(14, 0), LocalTime.of(16, 0), "Software Engineering");

        Exam e1 = new Exam("Midterm Exam", LocalDate.of(2025, 10, 2),
                LocalTime.of(9, 0), LocalTime.of(11, 0), "Room 101");

        StudySession s1 = new StudySession("Math Revision", LocalDate.of(2025, 9, 20),
                LocalTime.of(18, 0), LocalTime.of(20, 0), "Calculus");

        a1.displayTask();
        System.out.println("-----");
        e1.displayTask();
        System.out.println("-----");
        s1.displayTask();
    }
}