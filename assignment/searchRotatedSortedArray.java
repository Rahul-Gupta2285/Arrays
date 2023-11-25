public class searchRotatedSortedArray {

    public static int search(int arr[], int item) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == item) {
                return mid;
            } else if (arr[low] <= arr[mid]) {
                if (arr[low] <= item && item < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] < item && item <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 10, 2, 4 };
        int item = 6;
        System.out.println(search(arr, item));
    }
}
