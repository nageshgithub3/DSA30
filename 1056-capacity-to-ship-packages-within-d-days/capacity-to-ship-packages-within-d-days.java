class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for (int w : weights) {
            left = Math.max(left, w); 
            right = right + w; 
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShipWithinDays(weights, days, mid)) {
                right = mid; 
            } else {
                left = mid + 1;
            }
        }
        return left;
        
    }
    private boolean canShipWithinDays(int[] weights, int days, int capacity) {
        int curr = 0, nD = 1;
        for (int w : weights) {
            if (curr + w > capacity) {
                nD++;
                curr = 0;
            }
            curr += w;
        }
        return nD <= days;
    }
}