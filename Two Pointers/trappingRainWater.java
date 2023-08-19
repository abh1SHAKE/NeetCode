class Solution {
    public int trap(int[] height) {
        int size=height.length;

        // Initialize two-pointers, one starting from left and other from right.
        int left=0,right=size-1;

        /* Initialize variables to store the total trapped water
        & keep track of the maximum heights on the left and right. */
        int water=0,leftMax=0,rightMax=0;

        while(left<=right){
            // Update 'leftMax' and 'rightMax' respectively if the current height is greater.
            leftMax=Math.max(leftMax,height[left]);
            rightMax=Math.max(rightMax,height[right]);

            // If the 'leftMax' is less than the 'rightMax' calculate and add trapped water on the left.
            if(leftMax<rightMax){
                water=water+(leftMax-height[left]);
                left++;
            }
            // Else, calculate and add trapped water on the right.
            else{
                water=water+(rightMax-height[right]);
                right--;
            }
        }

        return water;
    }
}
