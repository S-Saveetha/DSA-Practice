//Contains Duplicate (LeetCode #217)
//Pattern: Hash Set
//Approach: Use a set to track seen numbers and check for duplicates
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n)