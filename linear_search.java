
//time complexity of this program is O(n) because isme n operations hote hai

public class linear_search {

    public static int linearSearch(int numbers[], int item) {
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch2(String fruits[], String item) {
        System.out.println();
        for (int i = 0; i < fruits.length; i++) {
            if (item == fruits[i]) {
                return i;
            }
        }
        return -1;
    }

    // public static void main(String[] args) {
    // int numbers[] = { 2, 6, 8, 10, 12 }, item = 13, foundedIndex;
    // foundedIndex = linearSearch(numbers, item);
    // if (foundedIndex == -1) {
    // System.out.println("Not found");
    // } else {
    // System.out.println("The element was found at index : " + foundedIndex);
    // }
    // }
    public static void main(String[] args) {
        String fruits[] = { "apple", "banana", "mango" }, item = "kiwi";
        int foundedIndex;
        foundedIndex = linearSearch2(fruits, item);
        if (foundedIndex == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(fruits[foundedIndex] + " was found at index : " + foundedIndex);
        }
    }
}
