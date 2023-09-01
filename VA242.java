// Question #100: Same Tree
// Time complexity: O(n*log(n)) && Space complexity: O(s + t)

import java.util.Arrays;

class VA242 {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
}
