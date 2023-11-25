
//time complexity of this program is O(n2) 

public class printMaxSubArraySumPrefix {

    public static int MaxSubArraySum(int numbers[]) {
        int sum = 0, maxSum = Integer.MIN_VALUE, prefix[] = new int[numbers.length], i, j;

        // calculate prefix
        prefix[0] = numbers[0];
        for (i = 1; i < prefix.length; i++) {
            prefix[i] = numbers[i] + prefix[i - 1];
        }

        for (i = 0; i < numbers.length; i++) {
            for (j = i; j < numbers.length; j++) {
                sum = 0;
                sum += i == 0 ? prefix[j] : (prefix[j] - prefix[i - 1]);
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 3, -2, 1 };
        System.out.println(MaxSubArraySum(numbers));
    }
}
