import java.util.*;
import java.math.*;

public class ZipCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter San Juan Zip Code:");
        int zip_code = in.nextInt();
        System.out.print("\nUnformatted Zip Code:"+zip_code);
        System.out.print("\nFormatted Zip Code:"+String.format("%05d", zip_code));
        int hotel_charge = 55;
        double total_cost;
        total_cost = Math.round((hotel_charge*1.06)*100)/100;
        System.out.println("\nThe total cost:"+total_cost);
    }
}
