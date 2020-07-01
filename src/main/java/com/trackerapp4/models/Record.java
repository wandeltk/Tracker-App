package com.trackerapp4.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@DiscriminatorColumn(name = "record_type", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "records")
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int record_id;

    @Column
    private String name;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "tracker_id")
    private Tracker tracker;

    public Record() {
    }

}
