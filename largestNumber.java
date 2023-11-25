
// time complexity : O(N)
// space complexity : O(1)
public class largestNumber {

    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(arr[i], largest);
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 3, 5, 4 };
        System.out.println(largest(arr));
    }
}
