
// time complexity of this program is o(N) and space complexity is o(1) 

public class buy_sell_stock {

    public static int buySellStock(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                profit = prices[i] - buyprice;
                maxprofit = Math.max(profit, maxprofit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buySellStock(prices));
    }
}
