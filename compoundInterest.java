import java.util.*;
import java.math.*;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double currentBalance,newBalance,INTEREST_RATE = 1.05;
        Integer yearCount;
        System.out.print("Number of years to invest:");
        yearCount = in.nextInt();
        System.out.print("Amount to invest:");
        currentBalance = in.nextDouble();
        newBalance = currentBalance;

        for(Integer i = 1 ;  i <= yearCount ; i++) {
            newBalance *= INTEREST_RATE;
            System.out.println("Year " + i + " balance = "+String.format("%.2f",newBalance));
            if(newBalance > 2 * currentBalance){
            System.out.println("You have doubled your investment");
            break;
            } 
        }
        in.close();
    }
}
