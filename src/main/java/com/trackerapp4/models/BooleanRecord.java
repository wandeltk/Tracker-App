package com.trackerapp4.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BOOLEAN")
public class BooleanRecord extends Record {

    private boolean input;

    public BooleanRecord() {
    }
}
