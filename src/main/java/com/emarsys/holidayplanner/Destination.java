package com.emarsys.holidayplanner;

public class Destination {
    String destinationName;
    Destination previousDestination;

    public Destination(String destinationName) {
        this.destinationName = destinationName;
        this.previousDestination = null;
    }
}
