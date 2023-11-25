
// time complexity : O(N^2)
public class pairs {

    public static void printPairs(int arr[]) {
        int totalPair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + totalPair);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printPairs(arr);
    }
}