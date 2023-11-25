
//time complexity of this program is 0(n3) because isme 3 loop lag rhe h jo n operations kr rhe hai ye hamari 
// (brute force) technique hai mtlb basic technique.

public class printMaxSubArraySum {
    public static int SubArraySum(int numbers[]) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += numbers[k];
                }
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = { -1, -2, 6, -1, 3 };
        System.out.println(SubArraySum(numbers));
    }
}
