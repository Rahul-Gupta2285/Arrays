
public class printSubArraySum {

    public static void print_sub_array_sum(int numbers[]) {
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.println(numbers[k] + " ");
                    sum += numbers[k];
                }
                System.out.println("Sum : " + sum);
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        print_sub_array_sum(numbers);
    }
}
