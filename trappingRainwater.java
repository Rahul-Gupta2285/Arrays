
public class trappingRainwater {

    public static int trappedRainwater(int height[]) {
        // calculate left max boundary - array
        int arraySize = height.length, i, waterlevel, trappedWater = 0;
        int leftMax[] = new int[arraySize];
        int rightMax[] = new int[arraySize];
        leftMax[0] = height[0];
        for (i = 1; i < arraySize; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary - array
        rightMax[arraySize - 1] = height[arraySize - 1];
        for (i = arraySize - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop

        for (i = 0; i < arraySize; i++) {
            // waterlevel = min(leftmax boundary, rightmax boundary)
            waterlevel = Math.min(leftMax[i], rightMax[i]);
            // trappedwater = waterlevel - height[i]
            trappedWater += (waterlevel - height[i]);
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Trapped water : " + trappedRainwater(height));
    }
}
