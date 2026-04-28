// 169. Majority Element
// Approach: Boyer-Moore Voting Algorithm
/*
The majority element appears more than n/2 times.

The idea is based on cancellation:
- If count becomes 0, choose a new candidate
- If current number == candidate → increment count
- Else → decrement count

Since the majority element appears more than n/2 times,
it will remain as the final candidate after all cancellations.
*/

class Solution {
    public int majorityElement(int[] nums) {
      int candidate = 0;
      int count = 0;
      for( int num : nums) {
        if(count == 0) {
            candidate = num;
        }
        count +=(num==candidate) ? 1 : -1;
      }
      return candidate;
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)