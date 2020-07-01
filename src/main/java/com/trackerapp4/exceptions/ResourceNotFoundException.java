package com.trackerapp4.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super("Requested resource could not be found.");
    }
}
