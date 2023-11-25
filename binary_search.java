
// time complexity: O(log n)
// space complexity: O(1)
public class binary_search {

    public static int search(int arr[], int item) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int item = 8;
        System.out.println(search(arr, item));
    }
}