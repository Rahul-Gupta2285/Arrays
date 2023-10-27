
//time complexity of this program is O(n2) 

public class printMaxSubArraySumPrefix {

    public static void print_max_sub_array_sum_prefix(int numbers[]) {
        System.out.println();
        int sum = 0, maxSum = Integer.MIN_VALUE, prefix[] = new int[numbers.length], i, j;

        // creating prefix
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
        System.out.println("max sub array sum : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 3, -2, 1 };
        print_max_sub_array_sum_prefix(numbers);
    }
}
