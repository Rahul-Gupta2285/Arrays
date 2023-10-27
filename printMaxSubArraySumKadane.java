
//time complexity of this program is O(n)

public class printMaxSubArraySumKadane {

    public static void print_max_sub_array_sum_kadane(int numbers[]) {
        System.out.println();
        int maxSum = Integer.MIN_VALUE, sum = 0, i;
        for (i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (sum < 0) {
                sum = 0;
            }
            maxSum = Math.max(maxSum, sum);
        }
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
        print_max_sub_array_sum_kadane(numbers);
    }
}
