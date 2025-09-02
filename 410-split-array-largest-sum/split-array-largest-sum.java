class Solution {
    public int splitArray(int[] nums, int k) {
         int left = 0, right = 0;
        for (int n : nums) {
            left = Math.max(left, n); 
            right += n;              
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (splitWithArray(nums, k, mid)) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        return left;
        
    }
    private boolean splitWithArray(int[] nums, int k, int maxSum) {
        int count = 1, sum = 0;
        for (int n : nums) {
            if (sum + n > maxSum) { 
                count++; 
                sum = 0;
            }
            sum += n;
        }
        return count <= k;
    }

}