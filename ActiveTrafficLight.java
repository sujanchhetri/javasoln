import java.util.*;

public class ActiveTrafficLight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TrafficLight myTrafficLight = new TrafficLight();
        
        myTrafficLight.setColor("Green");
        myTrafficLight.setState("false");

        System.out.println(myTrafficLight);

        myTrafficLight.setColor("Yellow");
        myTrafficLight.setState("false");

        System.out.println(myTrafficLight);

        myTrafficLight.setColor("Yellow");
        myTrafficLight.setState("true");
        
        System.out.println(myTrafficLight);

        in.close();
        }
}
