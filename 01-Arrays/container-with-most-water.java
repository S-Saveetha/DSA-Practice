// 11. Container With Most Water
// Approach: Two Pointers
// Given an array of integers representing vertical lines, find the maximum area of water that can be contained.
class Solution {
    public int maxArea(int[] height) {
       int max = 0;
       int curr = 0;
       int left = 0;
       int right = height.length - 1;
       while (left < right) {
        int minheight = Math.min(height[left],height[right]);
        int width = right - left;
        curr = minheight * width;
        max = Math.max(curr,max);
        if(height[left]<height[right]){
            left++;
        }
        else {
            right--;
        }
       }
       return max;
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
