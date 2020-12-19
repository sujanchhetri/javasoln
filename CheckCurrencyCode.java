import java.util.Currency;
import java.util.Iterator;
import java.util.Set;
import java.util.*;


public class CheckCurrencyCode {

    static int MAX_CURRENCIES = Currency.getAvailableCurrencies().size();
    static String[] CURRENCY_CODES = new String[MAX_CURRENCIES];

    /**
     * This method will load the currency_Codes array with 3 char codes. It does not
     * need to change
     */

    private static void loadCurrencyCodes() {
        Set<Currency> currencies = Currency.getAvailableCurrencies();
        Iterator<Currency> i = currencies.iterator();
        int idx = 0;
        while (i.hasNext()) {
            CURRENCY_CODES[idx++] = i.next().getCurrencyCode();
        }
    }

    /**
     * Raw display of the Currency_codes; Could also use
     * System.out.println(Arrays.toString(CURRENCY_CODES)); It does not need to
     * change
     */
    private static void showCurrencies() {
        for (int idx = 0; idx < MAX_CURRENCIES; ++idx) {
            System.out.print(CURRENCY_CODES[idx] + ",");
        }

        System.out.println();
        // System.out.println(Arrays.toString(CURRENCY_CODES));
    }

    /**
     * Look up the given currency here and set the return value to true if found or
     * false if not found
     * 
     * Hint: Use a FOR loop to traverse the loop
     * 
     * @param myCurrencyToFind
     * @return
     */
    private static boolean lookUpCurrency(String myCurrencyToFind) {
        for (int idx = 0; idx < MAX_CURRENCIES; ++idx) {
            if(myCurrencyToFind.equals(CURRENCY_CODES[idx])){
                return true;
            }     
        }
        return false;
    }

    /**
     * Prompt for a currency to find Call the lookUpCurrency with the inputted
     * currency code Display the found result Prompt to try again and exit this
     * method only if the choice is to not continue
     */
    private static void findMyCurrency() {
        Scanner in = new Scanner(System.in);
        String enterCurrency;
        String menuChoice;
        do{
            System.out.print("Enter a Currency Code to Find:");
            enterCurrency = in.next().toUpperCase();            
            if(lookUpCurrency(enterCurrency)){
                System.out.print(enterCurrency+"\nfound!\n");
            }else{
                System.out.print(enterCurrency+"\nNot Found!\n");
            }
            System.out.println("\nRetry?(Y/N):"); 
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

    public static void main(String[] args) {
        loadCurrencyCodes();
        showCurrencies();
        findMyCurrency();
        System.out.println("Task Completed");
    }

}