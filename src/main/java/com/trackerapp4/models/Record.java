package com.trackerapp4.models;

import javax.persistence.*;

@Entity
public abstract class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    @ManyToOne
    private int tracker_id;

    public Record() {
    }
}
