// Question #5: Longest Palindromic Substring
// Time complexity: O(n^2) && Space complexity: O(1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class LPS5 {
    int start = 0;
    int maxLength = 0;
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;

        for (int i = 0; i < s.length(); i++) {
            findPalindrome(s, i, i);
            findPalindrome(s, i, i + 1);
        }

        return s.substring(start, start + maxLength);
    }

    private void findPalindrome(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        if (maxLength < j - i - 1) {
            maxLength = j - i - 1;
            start = i + 1;
        }
    }
}
