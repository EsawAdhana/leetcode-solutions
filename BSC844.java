// Question #844: Backspace String Compare
// Time complexity: O(n) && Space complexity: O(n)

import java.util.Stack;

class BSC844 {
    public boolean backspaceCompare(String s, String t) {
        return convert(s).equals(convert(t));
    }
    private static Stack<Character> convert(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == '#')) {
                stack.push(str.charAt(i));
            } else {
                try {
                    stack.pop();
                } catch (Exception e) {

                }
            }
        }
        return stack;
    }
}
