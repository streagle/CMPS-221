// File: scheduler/entities/Exam.java
package scheduler.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Exam extends Task {
    private String location;

    public Exam(String title, LocalDate date, LocalTime startTime, LocalTime endTime, String location) {
        super(title, date, startTime, endTime);
        this.location = location;
    }

    @Override
    public void displayTask() {
        super.displayTask();
        System.out.println("Location: " + location);
    }
}