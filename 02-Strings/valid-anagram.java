// 242. Valid Anagram
// Approach: HashMap
/*  Create a HashMap to store the frequency of characters in string s. Then, iterate through string t and decrement the frequency of each character in the HashMap. 
If any character in t is not found in the HashMap or its frequency becomes negative, return false. Finally, if all characters are accounted for, return true.*/
import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        } 
        
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch) || map.get(ch)==0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }
}
// Time Complexity: O(n) 
// Space Complexity: O(k) 
