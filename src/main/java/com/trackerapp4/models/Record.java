package com.trackerapp4.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@DiscriminatorColumn(name = "record_type", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "records")
public abstract class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Date time_recorded;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "tracker")
    private Tracker tracker;

    public Record() {
    }

}
