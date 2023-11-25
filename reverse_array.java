
public class reverse_array {

    public static void printReverse(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printReverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}