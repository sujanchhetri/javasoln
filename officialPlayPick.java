import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class officialPlayPick {


public static int officialPlayPick3() {

    final int MIN_RANGE_VALUE = 0;

    final int MAX_RANGE_VALUE = 999;

    return ThreadLocalRandom.current().nextInt(MIN_RANGE_VALUE, MAX_RANGE_VALUE + 1);
}

public static void playPick3(Integer myPick3) {
    Integer playCounter = 0,myPick3Result;
        myPick3Result = officialPlayPick3();
        System.out.println("PlayCounter = " + myPick3Result+"&"+myPick3);
        while(myPick3 > 0 || myPick3 <=999 ){
            if (myPick3Result == myPick3) {
                System.out.println("PlayCounter = " + playCounter);
                break;
            }   
            playCounter++;     
        }
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer myPick3choice;
        
        String menuChoice;

        do{
        System.out.println("Enter your Pick 3 choice:0-999 or Press n to exit");
        myPick3choice = in.nextInt();
        playPick3(myPick3choice);
        menuChoice = in.next().toUpperCase();

        switch (menuChoice) {
            case "N":	
                break;
            default:  
                System.out.println("\nInvalid selection\n");
                break;
        }           
    } while(!menuChoice.equals("N"));  
    in.close();
}
}
