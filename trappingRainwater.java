
public class trappingRainwater {

    public static int trappedRainwater(int height[]) {
        int n = height.length;
        int waterlevel, trappedWater = 0;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        // calculate left max boundary - array
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // calculate right max boundary - array
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // loop
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftmax boundary, rightmax boundary)
            waterlevel = Math.min(leftMax[i], rightMax[i]);
            // trappedwater = waterlevel - height[i]
            trappedWater += (waterlevel - height[i]);
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Trapped water : " + trappedRainwater(height));
    }
}
