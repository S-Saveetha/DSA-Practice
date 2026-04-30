// 49. Group Anagrams
// Approach: HashMap
/*Create a HashMap to group anagrams together. For each string in the input array, 
 sort the characters of the string to create a key. and use this key to group the anagrams in the HashMap. 
 Finally, return the values of the HashMap as a list of lists.*/
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String,List<String>> map = new HashMap<>();
      for(String str : strs) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String key = String.valueOf(ch);
        if(!map.containsKey(key)){
            map.put(key,new ArrayList());
        }
        map.get(key).add(str);
      }
      return new ArrayList<>(map.values());
    }
}
// Time Complexity: O(m * n log n) 
// Space Complexity: O(m * n))