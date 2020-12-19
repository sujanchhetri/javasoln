import java.util.*;  
import java.util.Scanner;


class Savings {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Integer currentBalance = 0, amountToSaveEachMonth;
    System.out.println("Enter amount to save each month:");
    amountToSaveEachMonth = in.nextInt();
    Integer numberOfMonthsToSave;
    System.out.println("Enter the number of months to save:");
    numberOfMonthsToSave = in.nextInt();
    Integer currentSavingsMonth = 1;

    while(currentSavingsMonth <= numberOfMonthsToSave){
        currentBalance += amountToSaveEachMonth;
        System.out.println("For month "+currentSavingsMonth+",the balance is "+currentBalance);
        currentSavingsMonth++;
    }

    in.close();
    }
}

