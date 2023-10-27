
//prerequisite for binary search is that array should be sorted
//time complexity of this program is O(log n) because isme n/2 operations ho rhe hai

public class binary_search {

    public static int binarySearch(int numbers[], int item) {
        int low = 0, high = numbers.length - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (numbers[mid] == item) {
                return mid;
            } else if (numbers[mid] < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 }, item = 10, foundedIndex;
        foundedIndex = binarySearch(numbers, item);
        if (foundedIndex == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(item + " found at index : " + foundedIndex);
        }
    }
}
