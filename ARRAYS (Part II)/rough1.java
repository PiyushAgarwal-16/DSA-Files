public class rough1{
    public static int BuyandSellStocks(int arr[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        // int profit;
        // for(int i = 0; i<arr.length;i++){
        //     int currentprice = arr[i];
        //     if(buyprice < currentprice){
        //         profit = currentprice - buyprice;
        //         maxProfit = Math.max(profit, maxProfit);
        //     }
        //     else{
        //         buyprice = currentprice;
        //     }
        // }

        for(int price:arr){
            buyprice = Math.min(buyprice, price);
            maxProfit = Math.max(maxProfit, price-buyprice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int height[] = {5,4,3,6,9,10,2,8};
        System.out.println(BuyandSellStocks(height));
    }
}