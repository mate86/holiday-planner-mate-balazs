package com.emarsys.holidayplanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DestinationBuilder {
    public List<Destination> destinationList;
    private Map<String, String> destinationProperties;

    public DestinationBuilder(Map destinationProperties) {
        this.destinationProperties = destinationProperties;
        this.destinationList = new ArrayList<>();
    }

    public void createDestinationList() {
        for (String key : destinationProperties.keySet()) {
            Destination destination = new Destination(key);
            destinationList.add(destination);
        }

        for (Destination destination : destinationList) {
            // Gets the value what belongs to the key, named destinationName from destinationProperties map
            String value = destinationProperties.get(destination.destinationName);
            if (value != null) {
                for (Destination prevDest : destinationList) {
                    if (prevDest.destinationName == value) {
                        // Assigning previousDestination to actual destination
                        destination.previousDestination = prevDest;
                        break;
                    }
                }
            }
        }
    }
}
