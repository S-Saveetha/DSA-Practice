// missing number
// Approach : Math
/*  Calculate the sum of all numbers from 0 to n (inclusive) using the formula n*(n+1)/2.
    Then, calculate the sum of all numbers in the array.
    The difference between these two sums will be the missing number.*/
class Solution {
    public int missingNumber(int[] nums) {
        int n = 0;
        int k= nums.length;
        int s = k *(k + 1) / 2;
        for(int i=0;i<k;i++)
        {
         n += nums[i];   
        }
        return s-n;
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)