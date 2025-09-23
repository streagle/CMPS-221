// File: scheduler/entities/Assignment.java
package scheduler.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Assignment extends Task {
    private String courseName;

    public Assignment(String title, LocalDate date, LocalTime startTime, LocalTime endTime, String courseName) {
        super(title, date, startTime, endTime);
        this.courseName = courseName;
    }

    @Override
    public void displayTask() {
        super.displayTask();
        System.out.println("Course: " + courseName);
    }
}