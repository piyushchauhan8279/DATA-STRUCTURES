public class assignmentQues3{
    public static void buyAndSell(int prices[]){
        int buyingPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyingPrice<prices[i]){
                int profit=prices[i]-buyingPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
            else{
                buyingPrice=prices[i];
            }


        }
        System.out.println(maxProfit);
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        buyAndSell(prices);
    }
}