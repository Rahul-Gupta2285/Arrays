
// time complexity of this program is o(N) and space complexity is o(1) 

public class buy_sell_stock2 {

    public static int buySellStock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // today's profit
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buySellStock(prices));
    }
}
