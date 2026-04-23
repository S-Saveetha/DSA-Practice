// Problem: Two Sum (LeetCode #1)
// Pattern: Hash Map
// Approach: Store index in map and check complement
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> map = new HashMap<>();
      int n = nums.length;
     for(int i = 0; i < n;i++){
        int a = target-nums[i];
        if(map.containsKey(a)) {
            return new int[]{map.get(a),i};
        }
        map.put(nums[i],i);
     }
    
    return new int[]{};
}
}
//Time Complexity: O(n)
//Space Complexity: O(n)