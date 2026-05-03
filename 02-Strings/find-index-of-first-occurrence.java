// 28. Find the Index of the First Occurrence in a String
// Two Pointers
class Solution {
    public int strStr(String haystack, String needle) {
     for(int i=0,j=needle.length();j<=haystack.length();i++,j++)
     {
        if(haystack.substring(i,j).equals(needle))
        {
            return i;
        }
     }   
     return -1;
    }
}

// Time Complexity : O(n*m) 
// Space Complexity : O(m)