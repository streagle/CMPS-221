// File: scheduler/entities/StudySession.java
package scheduler.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class StudySession extends Task {
    private String subject;

    public StudySession(String title, LocalDate date, LocalTime startTime, LocalTime endTime, String subject) {
        super(title, date, startTime, endTime);
        this.subject = subject;
    }

    @Override
    public void displayTask() {
        super.displayTask();
        System.out.println("Subject: " + subject);
    }
}