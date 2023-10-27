
// time complexity of this program is o(N) and space complexity is o(N) 

public class buy_sell_stock1 {

    public static int buySellStock(int arr[]) {

        int maxprofit = Integer.MIN_VALUE;
        int aux[] = new int[arr.length];
        aux[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            aux[i] = Math.max(arr[i], aux[i + 1]);
        }

        for (int i = 0; i < arr.length; i++) {
            int profit = aux[i] - arr[i];
            maxprofit = Math.max(maxprofit, profit);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 7, 4, 9, 3 };
        System.out.println(buySellStock(arr));
    }
}
