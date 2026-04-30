// 20. Valid Parentheses
//Approach: Stack
/*Use a stack to keep track of opening parentheses. For each character in the string, if it is an opening parenthesis, push it onto the stack. 
If it is a closing parenthesis, check if the stack is empty or if the top of the stack does not match the corresponding opening parenthesis.
If either condition is true, return false. Finally, check if the stack is empty at the end of the string to ensure all parentheses are properly closed.*/
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)