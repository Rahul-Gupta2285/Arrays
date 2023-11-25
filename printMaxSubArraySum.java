
//time complexity of this program is 0(n3) because isme 3 loop lag rhe h jo n operations kr rhe hai ye hamari 
// (brute force) technique hai mtlb basic technique.

public class printMaxSubArraySum {

    public static void MaxSubArraySum(int arr[]) {
        int sum, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                System.out.println(sum);
                maxSum = Math.max(sum, maxSum);
            }
        }
        System.out.println("Max Subarrays Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        MaxSubArraySum(arr);
    }
}
