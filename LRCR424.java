import java.util.HashSet;
import java.util.Set;

class LRCR424 {
    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26];
        int left = 0;
        int length = 0;
        int largestCount = 0;

        for (int right = 0; right < s.length(); right++) {
            charCount[s.charAt(right) - 'A']++;
            largestCount = Math.max(largestCount, charCount[s.charAt(right) - 'A']);

            if ((right - left + 1 - largestCount) > k) {
                charCount[s.charAt(left++) - 'A']--;
            }
            length = Math.max(length, right - left + 1);
        }
        return length;
    }
}