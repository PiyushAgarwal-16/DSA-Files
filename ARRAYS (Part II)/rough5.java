public class rough5{
    public static void buySellStocks(int num[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i<num.length; i++){
            int currentprice = num[i];
            if(currentprice<buyprice){
                buyprice = currentprice;
            }
            maxprofit = (currentprice - buyprice) > maxprofit ? (currentprice - buyprice) : maxprofit;
        }

        System.out.println("Max Profit = " + maxprofit);
    }
    public static void main(String args[]){
        int num[] = {4,2,0,6,3,2,5};
        buySellStocks(num);
    }
}