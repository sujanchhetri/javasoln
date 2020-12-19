//TODO Add student information
/******************************
	
	Student Name:
	Student ID:
	Semester:
	
	COSC-1436
	El Centro College
	Professor Keith
	2019

	Class to report high and low Stock prices.
	
	*******************************/

    public class StockSearch {

        public static void main(String[] args) {
            StockPrices myStockPrices = new StockPrices();
            //TODO Call the methods here.
            // Display the high stock price
            // Display the high low stock price
            // ie myStockPrices.{yourMethodNameHere}
            
            //TODO remove the call to the demoMethod before submitting work
            //HOWEVER - Note how it is referenced/created
            //and what is happening
            myStockPrices.lowestStockPrice();
            myStockPrices.highestStockPrice();
            myStockPrices.biggestIncrease();
        }
    
    }