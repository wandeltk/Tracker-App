package com.trackerapp4.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("NUMBER")
public class NumberRecord extends Record {

    private int input;

    public NumberRecord() {
    }
}
