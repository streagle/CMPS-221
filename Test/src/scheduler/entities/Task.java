// File: scheduler/entities/Task.java
package scheduler.entities;

import java.time.LocalDate;
import java.time.LocalTime;

// Parent Class
public class Task {
    protected String title;
    protected LocalDate date;
    protected LocalTime startTime;
    protected LocalTime endTime;

    public Task(String title, LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.title = title;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void displayTask() {
        System.out.println("Task: " + title);
        System.out.println("Date: " + date);
        System.out.println("Start: " + startTime);
        System.out.println("End: " + endTime);
    }
}