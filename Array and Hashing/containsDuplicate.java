class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        
        // Traversing the whole integer array
        for(int num: nums){
            // If set already contains the element,
            // return true. Else just add it to the set.
            if(set.contains(num)) return true;
            else set.add(num);
        }

        return false;
    }
}
