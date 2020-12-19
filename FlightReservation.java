/**
 * 
 * @author Professor
 * 
 * Simple FlightReservation Class
 * COSC 1436
 *
 */

import java.time.LocalTime;


public class FlightReservation {

	// Private Variables
	private LocalTime departureTime;
	private LocalTime arrivalTime;
	
	private String origin;
	private String destination;
	
	private int flightNumber;

	
	// Methods
	public LocalTime getDepartureTime() {
		return departureTime;
	}

	// Needs only hour and minute
	public void setDepartureTime(int hour, int minute) {
		this.departureTime = LocalTime.of(hour,minute);
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	// Needs only hour and minute
	public void setArrivalTime(int hour, int minute) {
		this.arrivalTime = LocalTime.of(hour,minute);
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	@Override
	public String toString() {
		return "FlightReservation [departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", origin="
				+ origin + ", destination=" + destination + ", flightNumber=" + flightNumber + "]";
	}

		
	
}