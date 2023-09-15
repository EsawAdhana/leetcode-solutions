// Question #242: Valid Anagram
// Time complexity: O(n) && Space complexity: O(s + t)

import java.util.Arrays;

class VA242 {
   public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] != 0) return false;
        }

        return true;
    }
}
