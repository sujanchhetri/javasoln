import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class popularBabyNames{
    public static void main(String args[])throws FileNotFoundException {
        File text = new File("/home/sujan/Desktop/java/USPopularBabyNames2014.txt");

        Scanner scanner = new Scanner(text);

    
        int lineNumber = 1;
        String menuChoice;
        String line = scanner.nextLine();


        while(scanner.hasNextLine()){
            lineNumber++;
        } 
        System.out.println("Data file loaded. There are "+ lineNumber + " names in the ArrayList.");

        System.out.println("\nEnter Name or EXIT:"); 
            menuChoice = scanner.next().toUpperCase();
        
        if(line.equals(menuChoice)){
            System.out.println(menuChoice+"is a popular baby name."); 
        }else{
            System.out.println(menuChoice+"is NOT a popular baby name."); 
        }
        
    scanner.close();
    }
}