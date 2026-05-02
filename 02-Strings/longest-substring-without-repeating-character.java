// 3. Longest Substring Without Repeating Characters
// Approach : HashSet and Two Pointers


import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int r = 0;
        int l = 0;
        int max = 0;
        HashSet<Character> str = new HashSet<>();
        while( r < n)  {
            if( !str.contains(s.charAt(r))) {
                str.add(s.charAt(r));
                max = Math.max(max,r-l+1);
                r++;
            }
            else{
                str.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)