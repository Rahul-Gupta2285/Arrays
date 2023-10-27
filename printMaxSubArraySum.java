
//time complexity of this program is 0(n3) because isme 3 loop lag rhe h jo n operations kr rhe hai ye hamari 
// (brute force) technique hai mtlb basic technique.

public class printMaxSubArraySum {
    public static void printSubArrays(int numbers[]) {
        System.out.println();
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += numbers[k];
                }
                System.out.println(sum);
                maxSum = Math.max(sum, maxSum);
            }
        }
        System.out.println("max sub array sum : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);
    }
}
