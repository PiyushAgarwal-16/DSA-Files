public class Buy_Sell_Stocks{
    public static int BuyandSellStocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                if(profit > maxProfit){
                    maxProfit = profit;
                } // Alternatively maxProfit = Math.max(maxProfit, profit);
            } else{
                buyprice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        // int prices2[] = {3,2,1};

        System.out.println(BuyandSellStocks(prices));
    }
}