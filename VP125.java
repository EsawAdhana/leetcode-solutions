// Question #125: Valid Palindrome
// Time complexity: O(n) && Space complexity: O(n)

class VP125 {
    public boolean isPalindrome(String s) {
        if (s.length() < 2) return true;
        s = s.toLowerCase();
        int p1 = 0;
        int p2 = s.length() - 1;
        while (p1 < p2) {
            if (!Character.isLetterOrDigit(s.charAt(p1))) {
                p1++;
            } else if (!Character.isLetterOrDigit(s.charAt(p2))) {
                p2--;
            } else {
                if (s.charAt(p1) != s.charAt(p2)) {
                    return false;
                }
                p1++;
                p2--;
            }
        }
        return true;
    }
}
