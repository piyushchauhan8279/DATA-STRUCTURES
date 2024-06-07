import java.util.*;
public class buyAndSellStocks{
    public static int buyAndSell(int prices[]){
        int buyingPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyingPrice<prices[i]){
                int Profit=prices[i]-buyingPrice;
                maxProfit=Math.max(maxProfit,Profit);
            }
            else{
                buyingPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndSell(prices));
    }
}