
public class trappingRainwater {

    public static int trappedRainwater(int height[]) {
        // calculate left max boundary - array
        int size = height.length;
        int waterlevel, trappedWater = 0;
        int leftMax[] = new int[size];
        int rightMax[] = new int[size];
        leftMax[0] = height[0];
        for (int i = 1; i < size; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary - array
        rightMax[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop
        for (int i = 0; i < size; i++) {
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
