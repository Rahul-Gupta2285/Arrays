
// time complexity of this program is o(N2) and space complexity is o(1) which constant

public class buy_sell_stock {

    public static int buySellStock(int arr[]) {
        int maxprofit = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int profit = arr[j] - arr[i];
                maxprofit = Math.max(maxprofit, profit);
            }
            System.out.println();
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 7, 4, 9, 3 };
        System.out.println(buySellStock(arr));
    }
}
