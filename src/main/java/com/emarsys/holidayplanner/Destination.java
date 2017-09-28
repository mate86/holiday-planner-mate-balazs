package com.emarsys.holidayplanner;

public class Destination {
    String destinationName;
    Destination previousDestination;

    public Destination(String destinationName) {
        this.destinationName = destinationName;
        this.previousDestination = null;
    }

//    public Destination(String destinationName, Destination previousDestination) {
//        this.destinationName = destinationName;
//        this.previousDestination = previousDestination;
//    }
}
