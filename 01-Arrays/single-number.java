// single number
// Approch : Bit Manipulation
/*  Use XOR operator to find the single number in the array. XOR of a number with itself is 0 
and XOR of a number with 0 is the number itself. So, if we XOR all the numbers in the array,
the result will be the single number.*/
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int n:nums)
            res=res^n;
        
        return res;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
