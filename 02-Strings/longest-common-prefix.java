// 14. Longest Common Prefix 
// Approach : Vertical Scanning
class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0)
      return "";

    for (int i = 0; i < strs[0].length(); ++i)
      for (int j = 1; j < strs.length; ++j)
        if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i))
          return strs[0].substring(0, i);

    return strs[0];
  }
}
// Time Complexity : O(n*m) 
// Space Complexity : O(1)