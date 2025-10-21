class Solution {
    public int[] twoSum(int[] nums, int target) {

        // create a HashMap to store numbers and their indices
        Map<Integer,Integer> map = new HashMap<>();

        //Iterate through the array
        for(int i=0;i<nums.length;i++){
            // Calculate the compliment of the current number
            int compliment = target - nums[i];

            // Check if the complement is already in the map

            if(map.containsKey(compliment)){
                //if found, return the indices of the compliment and the current number
                return new int[] {map.get(compliment), i};
            }
            //Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }
        // Return an empty array if no solution is found (this case won't occur as per)
        return new int[]{};
        
    }
}