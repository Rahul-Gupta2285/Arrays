
//time complexity of this program is O(log n) because isme n/2 operations ho rhe hai
//space complexity of this program is O(1) means constant because isme koi space use nhi ho rhi
public class search_rotated_sorted_array {

    public static int searchRotatedSortedArray(int numbers[], int item) {
        int low = 0, high = numbers.length - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (numbers[mid] == item) {
                return mid;
            } else if (numbers[low] < numbers[mid]) {
                if (item >= numbers[low] && item < numbers[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (item > numbers[mid] && item <= numbers[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 40, 50, 10, 20, 30 }, item = 50, foundedIndex;
        foundedIndex = searchRotatedSortedArray(numbers, item);
        if (foundedIndex == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(item + " found at index : " + foundedIndex);
        }
    }
}
