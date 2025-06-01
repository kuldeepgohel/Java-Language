public class buySellStocks {

    public static int buySellStocks(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0 ; i<price.length;i++)
        {
            if(buyPrice<price[i]) // profitable case
            {
                int profit = price[i]-buyPrice; //today's profit
                maxProfit=Math.max(profit,maxProfit);
            }
            else {
                buyPrice=price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};
        int result = buySellStocks(price);
        System.out.println(result);
    }
}
