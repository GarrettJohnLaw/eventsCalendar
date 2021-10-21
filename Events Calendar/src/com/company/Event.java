package com.company;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Timer;

public class Event {
private String name;
private String performer;
private ZonedDateTime dateAndTime;
private Venue venue;
private Program program;
private String description;

public Event(String name) {
    this.name = name;
}


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPerformer() {
        return performer;
    }
    public void setPerformer(String performer) {
        this.performer = performer;
    }
    public ZonedDateTime getDateAndTime() {
        return dateAndTime;
    }
    public void setDateAndTime(ZonedDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
    public Venue getVenue() {
        return venue;
    }
    public void setVenue(Venue venue) {
        this.venue = venue;
    }
    public Program getProgram() {
        return program;
    }
    public void setProgram(Program program) {
        this.program = program;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", performer='" + performer + '\'' +
                ", dateAndTime=" + dateAndTime +
                '}';
    }
}
