// Maximum Subarray
// Pattern: Kadane’s Algorithm (Dynamic Programming)
// Approach : Keep track of current sum and maximum sum at each step, reset current sum to 0 if it becomes negative

class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = 0;
        int maxsum = nums[0];
        for(int i = 0; i < nums.length;i++){
            currsum+=nums[i];
            if(maxsum<currsum) maxsum = currsum;
            if(currsum<0) currsum=0;
        }
        return maxsum;
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
