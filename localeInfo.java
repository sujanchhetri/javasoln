import java.util.*; 

public class localeInfo { 

    public static void displayMyLocaleInfo(Locale myPassedLocale){
        Currency currency = Currency.getInstance(myPassedLocale);
        System.out.println("The country "+myPassedLocale.getDisplayCountry()+" speaks "+myPassedLocale.getDisplayLanguage()+" and uses the currency "+currency.getDisplayName()+".");
    }
    public static void main(String[] args) 
    { 
        Locale usa = new Locale("en","us");
        displayMyLocaleInfo(usa);
        Locale gb = new Locale("en","gb");
        displayMyLocaleInfo(gb);
        Locale mx = new Locale("es","mx");
        displayMyLocaleInfo(mx);
        Locale pa = new Locale("es","pa");
        displayMyLocaleInfo(pa);
        Locale jp = new Locale("ja","jp");
        displayMyLocaleInfo(jp);
    } 
} 