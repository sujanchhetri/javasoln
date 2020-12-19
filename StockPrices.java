
//TODO Add Student Information
/******************************
	Student Name:
	Student ID:
	Semester:

	COSC-1436
	El Centro College
	Professor Keith

	Topic:Arrays of Objects
	*******************************/
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class StockPrices {

    static final int MAX_STOCK_COUNT = 24;
    static final int MIN_STOCK_PRICE = 10;
    static final int MAX_STOCK_PRICE = 100;

    // Create the array of Stock Objects
    List<Stock> myStocks = new ArrayList<Stock>();
    /**
     * This constructor will load the values of the stock array. Nothing to change
     * here.
     */

    public StockPrices() {
        char startChar = 'A';
        String tmpSymbol = null;
        int startPrice = 0;
        int priceRightNow = 0;

        for (int idx = 0; idx < MAX_STOCK_COUNT; idx++) {
            //Generate Stock Symbol for testing
            tmpSymbol = "" + (char) (startChar + idx) + (char) (startChar + idx + 1) + (char) (startChar + idx + 2);

            //Generate Random data for pricing
            startPrice = ThreadLocalRandom.current().nextInt(MIN_STOCK_PRICE, MAX_STOCK_PRICE + 1);
            priceRightNow = ThreadLocalRandom.current().nextInt(MIN_STOCK_PRICE, MAX_STOCK_PRICE + 1);
            myStocks.add(new Stock(tmpSymbol, startPrice, priceRightNow));
            System.out.println(myStocks.get(idx));
        }
    }

    // TODO
    /**************************************************
     * Assignment:
     * 
     * 1. Create a method that will report the amount and symbol of the current
     * lowest price stock 2. Create a method that will report the amount and symbol
     * of the current highest price stock
     * 
     * Extra Credit - Create a method that will report the stock with the biggest
     * increase.
     *************************************************/
    public void lowestStockPrice() {
        Stock lowStockPrice = myStocks.get(0);
        for (int idx = 1; idx < MAX_STOCK_COUNT; idx++) {
            if (lowStockPrice.getCurrentPrice() > myStocks.get(idx).getCurrentPrice())
                lowStockPrice = myStocks.get(idx);
        }

        System.out.println("Current Lowest Stock Symbol :" + lowStockPrice.getStockSymbol() + ", current price:" + lowStockPrice.getCurrentPrice());
    }

    public void highestStockPrice()  {
        Stock highStockPrice = myStocks.get(0);
        for (int idx = 1; idx < MAX_STOCK_COUNT; idx++) {
            if (highStockPrice.getCurrentPrice() < myStocks.get(idx).getCurrentPrice())
                highStockPrice = myStocks.get(idx);
        }

        System.out.println("Current Highest Stock Symbol :" + highStockPrice.getStockSymbol() + ", current price:" + highStockPrice.getCurrentPrice());
    }

    public void biggestIncrease() {
        Stock biggestIncreaseStock = myStocks.get(0);
        for (int idx = 1; idx < MAX_STOCK_COUNT; idx++) {
            if ((biggestIncreaseStock.getOpeningPrice() - biggestIncreaseStock.getCurrentPrice()) >
                    (myStocks.get(idx).getOpeningPrice() - myStocks.get(idx).getCurrentPrice()))
                biggestIncreaseStock = myStocks.get(idx);
        }

        System.out.println("Biggest Increase Stock Symbol :" + biggestIncreaseStock);
    }
    

}