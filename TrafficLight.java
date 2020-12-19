import java.util.*;


public class TrafficLight {

	// Private Variables
	private String color;
	private String state;
	
	

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
    }
    
    public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
    
    @Override
	public String toString() {
		return "Light is "+color+" - Flashing = "+state;
	}
}