class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();

        // Traverse the array and if (target-currentElement) difference exists
        // in the the map, then return indices of currentElement and difference.
        for(int i=0;i<nums.length;i++){
            int difference=target-nums[i];
            if(map.containsKey(difference)){
                return new int[]{i,map.get(difference)};
            }

            // Else just add the current element and its index to the map.
            map.put(nums[i],i);
        }

        // If no solutions
        return new int[]{};
    }
}
