public class trappingWater {

    public static int trappingWater(int height[]) {
        int n = height.length;
        //calculate the left max boundary array
        int lma[] = new int[n];
        lma[0] = height[0];
        for (int i = 1; i < n; i++) {
            lma[i] = Math.max(lma[i - 1], height[i]);
        }
        //calculate the right max boundary array

        int rma[] = new int[n];
        rma[n - 1] = height[n-1];
        for (int i = n - 2; i >= 0; i--) {
            rma[i] = Math.max(height[i], rma[i + 1]);
        }

        int trappedWater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            //waterLevel = min(left boundary ,right boundary)
            int waterLevel = Math.min(lma[i], rma[i]);
//        trapping Water = waterLevel - height[i]
//        answer+=trapping water
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println( trappingWater(height));
    }
}
