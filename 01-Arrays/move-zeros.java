//Move Zeroes
// Approach: Two Pointers
// Use two pointers to keep track of the current position and the position of the last non-zero element
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp = nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
        
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)