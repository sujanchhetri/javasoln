import java.util.*;

public class GradeDisplay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Grade (0-100):");
        Integer grade = in.nextInt();

        if(grade >=90 && grade<=100){
            System.out.println("Letter Grade is A");
        }
        else if(grade >=80 && grade<=89){
            System.out.println("Letter Grade is B");
        }
        else if(grade >=70 && grade<=79){
            System.out.println("Letter Grade is C");
        }
        else if(grade >=60 && grade<=69){
            System.out.println("Letter Grade is D");
        }
        else if(grade <60){
            System.out.println("Letter Grade is F");
        }
        else{
            System.out.println("Grade entered is not in range");
        }
        }
}
