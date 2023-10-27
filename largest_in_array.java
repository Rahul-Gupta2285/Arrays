
//time complexity of this program is o(n) because isme n operations ho rhe h

public class largest_in_array {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE, i;
        for (i = 0; i < numbers.length; i++) {
            largest = Math.max(largest, numbers[i]);
            smallest = Math.min(smallest, numbers[i]);
        }
        System.out.println("Smallest number is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 6, -5, -1, 8 };
        System.out.println("Largest number is : " + getLargest(numbers));
    }
}
