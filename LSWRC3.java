import java.util.HashSet;
import java.util.Set;

class LSWRC3 {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() <= 1) return s.length();

        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
            }
        }
        return maxLength;
    }
}