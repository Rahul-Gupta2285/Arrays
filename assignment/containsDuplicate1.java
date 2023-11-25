public class containsDuplicate1 {

    // time complexity : O(N^2)
    // brute force approch
    public static boolean contains_duplicate(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 2, 6 };
        System.out.println(contains_duplicate(arr));
    }
}
