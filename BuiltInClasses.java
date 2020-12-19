import java.util.*;  

class BuiltInClasses {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("OS =");
    System.out.println(System.getProperty("os.name"));
    System.out.print("Milliseconds since Jan 1 1970 = ");
    System.out.println(System.currentTimeMillis());

    String awake = "True";
    Boolean isAwake;
    isAwake = Boolean.parseBoolean(awake); 
    System.out.print("My Boolean result for isAwake = "+isAwake);


    Integer value = 100;

    System.out.print("\nMy Hex Result for 100 = "+Integer.toHexString(value));
    in.close();
    }
}

