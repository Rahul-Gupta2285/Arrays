
//time complexity of this program is O(n)
//space complexity of this program is O(1)

public class printMaxSubArraySumKadane {

    public static int sum(int arr[]) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxSum = Math.max(sum, maxSum);
            sum = Math.max(sum, 0);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -1, -2, -3, -4 };
        System.out.println(sum(arr));
    }
}
