
public class reverse_array {

    public static void reverseArray(int numbers[]) {
        int lowerIndex = 0, upperIndex = numbers.length - 1;
        while (lowerIndex < upperIndex) {
            numbers[lowerIndex] += numbers[upperIndex];
            numbers[upperIndex] = numbers[lowerIndex] - numbers[upperIndex];
            numbers[lowerIndex] -= numbers[upperIndex];
            lowerIndex++;
            upperIndex--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5 }, i;
        reverseArray(numbers);
        for (i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
