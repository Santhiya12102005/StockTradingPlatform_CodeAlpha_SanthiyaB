//Stocktradingplatform
import java.util.HashMap;
import java.util.Scanner;
class Stocktradingplatform{
    String name;
    double price;

    public Stock(String name, double price)
    {
        this.name=name;
        this.price=price;
    }
    public String toString()
    {
        return name+"-$"+price;
    }
}
class portfolio{
    HashMap<String,Integer>holdings=new hashMap<>();
    double balance=10000.0;
    public void buystock(String stock,int quality,double price)
    {
        if(price*quantity>balance)
        {
            System.out.println("Insufficient funds to buy "+quantity+" shares of"+stock);
            return;
        }
        holdings.put(stock,holdings.getOrDefault(stock,0)+quantity);
        balance-=price*quantity;
        System.out.println("Bought "+quantity+" shares of"+stock);
    }
    public void sellstock(String stock,int quantity,double price)
    {
    {
        if(!holdings.containsKey(stock)||holdings.get(stock)<quantity)
        System.out.println("Not enough shares to sell");
        return;
    }
    holdings.put(stock,holdings.get(stock)-quantity);
    balance+=price*quantity;
    System.out.println("Sold"+quantity+" shares of"+stock);
    }
    public void viewportfolio()
    {
        System.out.println("Current portfolio: "+holdings);
        System.out.println("Available balance: $ "+balance);
    }
}
public class stocktradingplatform{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String, stock>market=new HashMap<>();
        System.out.println("Enter number of stocks to add to the market: ");
        int numofstocks=sc.nextInt();
        for(int i=0;i<numofstock;i++)
        {
            System.out.println("Enter stock symbol: ");
            String symbol=sc.next();
            System.out.println("Enter stock price: ");
            double price=sc.nextDouble();
            market.put(symbol,new Stock(symbol,price));
        }
        portfolio pf=new portfolio();
        
        while(true)
        {
           System.out.println("\nWelcome to the Stock Trading Platform");
           System.out.println("1. View Market Data");
           System.out.println("2. Buy Stock");
           System.out.println("3. Sell Stock");
           System.out.println("4. View Portfolio");
           System.out.println("5. Exit");
           
           int choice=sc.nextInt;
           switch(choice)
           {
            case 1:
            System.out.println("Market data: ");
            for (Stock stock : market.values()) {
                System.out.println(stock);
            }
            break;
        case 2:
            System.out.print("Enter stock symbol: ");
            String buySymbol = sc.next();
            Stock buyStock = market.get(buySymbol);
            if (buyStock != null) {
                System.out.print("Enter quantity to buy: ");
                int quantity = sc.nextInt();
                pf.buyStock(buyStock.name, quantity,
                buyStock.price);
            } 
            else {
                System.out.println("Invalid stock symbol");
            }
            break;
        case 3:
            System.out.print("Enter stock symbol: ");
            String sellSymbol = sc.next();
            Stock sellStock = market.get(sellSymbol);
            if (sellStock != null) {
                System.out.print("Enter quantity to sell: ");
                int quantity = sc.nextInt();
                pf.sellStock(sellStock.name, quantity,
                sellStock.price);
            } 
            else {
                System.out.println("Invalid stock symbol");
            }
            break;
        case 4:
            pf.viewportfolio();
            break;
        case 5:
            System.out.println("Exiting...");
            sc.close();
            System.exit(0);
            break;
        
        default:
            System.out.println("Invalid choice");
           }
        }
    }
}
