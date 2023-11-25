
//time complexity of this program is O(n)

public class printMaxSubArraySumKadane {

    public static int MaxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(MaxSubArraySum(arr));
    }
}
