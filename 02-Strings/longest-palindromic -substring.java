// 5. Longest Palindromic Substring
// Approach: Expand Around Center

class Solution {
    
    public int expand(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public String longestPalindrome(String s) {
        int start = 0, end = 0;

        for(int i = 0; i < s.length(); i++){
            int l1 = expand(s, i, i);       // odd length
            int l2 = expand(s, i, i + 1);   // even length

            int max = Math.max(l1, l2);

            if(max > end - start + 1){
                start = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }

        return s.substring(start, end + 1);
    }
}

// Time Complexity: O(n^2)
// Space Complexity: O(1)