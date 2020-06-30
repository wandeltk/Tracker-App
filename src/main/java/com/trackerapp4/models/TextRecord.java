package com.trackerapp4.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TEXT")
public class TextRecord extends Record {

    private String input;

    public TextRecord() {
    }
}
