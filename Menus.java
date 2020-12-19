import java.util.*;

public class Menus
{
    public static void buyStock(){
        System.out.println("\nBuy Stock\n");
    }

    public static void sellStock(){
        System.out.println("\nSell Stock\n");
    }

	public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
        String  menuChoice;
            do{
            System.out.println("A. Buy Stock");
            System.out.println("B. Sell Stock");
            System.out.println("X. Exit");
            System.out.println("Enter your selection");
            menuChoice = in.next().toUpperCase();
        

        switch (menuChoice) {
                case "A":
                buyStock();
					break;
                case "B":	
                sellStock();
					break;
                case "X":
					break;
				default:  
					System.out.println("\nInvalid selection\n");
					break;
            }           
        } while(!menuChoice.equals("X"));  
			in.close();
    } 
    
}

