package org.mp.tracker.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Event {

    public enum Intensity {
        Low, Medium, High
    }

    public enum DurationUnits {
        Seconds, Minutes, Hours, Days
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    private int duration;

    @Enumerated(EnumType.STRING)
    private DurationUnits units;

    @Enumerated(EnumType.STRING)
    private Intensity intensity;

    private boolean medicineTaken;

    private String notes;


    protected Event() {}

    public Event(Date date, int duration,
                 DurationUnits units, Intensity intensity,
                 boolean medicineTaken, String notes) {
        this.date = date;
        this.duration = duration;
        this.units = units;
        this.intensity = intensity;
        this.medicineTaken = medicineTaken;
        this.notes = notes;
    }

    public Long getId() {
        return this.id;
    }

    public Date getDate(){
        return this.date;
    }

    public int getDuration() {
        return duration;
    }

    public DurationUnits getUnits() {
        return units;
    }

    public Intensity getIntensity() {
        return intensity;
    }

    public boolean isMedicineTaken() {
        return medicineTaken;
    }

    public String getNotes() {
        return notes;
    }
}
