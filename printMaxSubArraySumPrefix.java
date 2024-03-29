
//time complexity of this program is O(n2) 
//space complexity of this program is O(n)
public class printMaxSubArraySumPrefix {

    public static int MaxSubArraySum(int arr[]) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        // calculate prefix
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) { // auxilary array
            prefix[i] = arr[i] + prefix[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                sum += i == 0 ? prefix[j] : (prefix[j] - prefix[i - 1]);
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        System.out.println(MaxSubArraySum(arr));
    }
}
