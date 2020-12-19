import java.util.*;
import java.time.LocalTime;

public class FlightResCheck {
    public static void main(String[] args) {
        FlightReservation myFlight = new FlightReservation();

        LocalTime departureTime = LocalTime.of(6, 30);
        LocalTime arrivalTime = LocalTime.of(8, 30);
        String origin = "LA";
        String destination = "texas";
        int flightNumber = 111;

        myFlight.setDepartureTime(departureTime.getHour(),departureTime.getMinute());
        myFlight.setArrivalTime(arrivalTime.getHour(),arrivalTime.getMinute());
        myFlight.setOrigin(origin);
        myFlight.setDestination(destination);
        myFlight.setFlightNumber(flightNumber);
        System.out.println(myFlight);

        flightNumber = 222;
        departureTime = LocalTime.of(7, 30);
        arrivalTime = LocalTime.of(9, 30);
        myFlight.setDepartureTime(departureTime.getHour(),departureTime.getMinute());
        myFlight.setArrivalTime(arrivalTime.getHour(),arrivalTime.getMinute());
        myFlight.setFlightNumber(flightNumber);
        System.out.println(myFlight);

    }
}