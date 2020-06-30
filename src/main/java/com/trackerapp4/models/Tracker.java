package com.trackerapp4.models;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "trackers")
public class Tracker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tracker_id;

    @Column
    private String name;

    @Column
    private String creation_date;

    @Enumerated
    private TrackerType type;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "tracker_id")
    private List<Record> records;

    public Tracker() {
    }

    public Tracker(String name, String creation_date, TrackerType type) {
        this.name = name;
        this.creation_date = creation_date;
        this.type = type;
    }

    public Tracker(int id, String name, String creation_date, TrackerType type) {
        this.tracker_id = id;
        this.name = name;
        this.creation_date = creation_date;
        this.type = type;
    }

    public int getId() {
        return tracker_id;
    }

    public void setId(int id) {
        this.tracker_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public TrackerType getType() {
        return type;
    }

    public void setType(TrackerType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tracker tracker = (Tracker) o;
        return tracker_id == tracker.tracker_id &&
                Objects.equals(name, tracker.name) &&
                Objects.equals(creation_date, tracker.creation_date) &&
                type == tracker.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tracker_id, name, creation_date, type);
    }

    @Override
    public String toString() {
        return "Tracker{" +
                "id=" + tracker_id +
                ", name='" + name + '\'' +
                ", creation_date='" + creation_date + '\'' +
                ", type=" + type +
                '}';
    }
}
