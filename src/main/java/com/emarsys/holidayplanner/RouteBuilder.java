package com.emarsys.holidayplanner;

import java.util.ArrayList;
import java.util.List;

public class RouteBuilder {
    private List<Destination> destinationList;

    public RouteBuilder(List<Destination> destinationList) {
        this.destinationList = destinationList;
    }

    public String findOptimalRoutes() {
        String optimalRouteString = "";
        List<Destination> routeHeads = findPartialRoutes();

        for (Destination routeFirstPart : routeHeads) {
            for (Destination routeSecondPart : routeHeads) {
                if (!routeFirstPart.equals(routeSecondPart)) {
                    Destination optimalRoute = linkTwoRouteParts(routeFirstPart, routeSecondPart);
                    optimalRouteString = routeToString(optimalRoute);
                    return optimalRouteString;
                }
            }
        }
        return optimalRouteString;
    }

    private String routeToString(Destination optimalRoute) {
        String optimalRouteString = "";
        while (optimalRoute.previousDestination != null) {
            optimalRouteString += optimalRoute.destinationName;
            optimalRoute = optimalRoute.previousDestination;
        }
        optimalRouteString += optimalRoute.destinationName;
        optimalRouteString = new StringBuilder(optimalRouteString).reverse().toString();
        return optimalRouteString;
    }

    private List<Destination> findPartialRoutes() {
        List<Destination> routeHeads = new ArrayList<>();
        for (Destination destination : destinationList) {
            routeHeads.add(destination);
        }

        for (Destination destination : destinationList) {
            if (destination.previousDestination != null) {
                routeHeads.remove(destination.previousDestination);
            }
        }
        return routeHeads;
    }

    private Destination linkTwoRouteParts(Destination firstPart, Destination secondPart) {
        if (firstPart.previousDestination == null) {
            firstPart.previousDestination = secondPart;
            return firstPart;
        }
        linkTwoRouteParts(firstPart.previousDestination, secondPart);
        return firstPart;
    }
}
