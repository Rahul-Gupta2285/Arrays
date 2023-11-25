
// time complexity of this program is o(N) and space complexity is o(1) 

public class buy_sell_stock2 {

    public static int buySellStock(int arr[]) {
        int maxprofit = 0;
        int minSoFar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            maxprofit = Math.max(maxprofit, profit);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buySellStock(arr));
    }
}
