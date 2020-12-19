import java.util.*;

public class MonthName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String menuChoice;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Integer i ;
        do{
        System.out.println("Enter the Month of the Year:");
        i = in.nextInt();
        if(i >0 || i<12){
        System.out.println("The month name is "+months[i]);
        }else{
            System.out.println("\nInvalid Entry\n");
        }
        System.out.println("Try again (Y/N):"); 
        menuChoice = in.next().toUpperCase();

        switch (menuChoice) {
            case "Y":	
                continue;
            case "N":	
                break;
            default:  
            System.out.println("\nInvalid selection\n");
                break;
        }          
    } while( !menuChoice.equals("N"));  
    in.close();
}
}
