// 125. Valid Palindrome
// Approach: Two Pointers
// Use two pointers, one starting from the beginning of the string and the other from the end. Move the pointers towards each other while skipping non-alphanumeric characters.
class Solution {
    public boolean isPalindrome(String s) {
         if(s.isEmpty()){
            return true;
         }
         int l = 0;
         int r = s.length()-1;
         while(l<=r) {
            char a = s.charAt(l);
            char b = s.charAt(r);
            if(!Character.isLetterOrDigit(a)){
                l++;
            }
            else if(!Character.isLetterOrDigit(b)){
                r--;
            }
            else {
                if(Character.toLowerCase(a)!=Character.toLowerCase(b)){
                        return false;
                }
                l++;
                r--;
         }
         }
         return true;
    
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)