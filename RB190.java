// Question #190: Reverse Bits
// Time complexity: O(1) && Space complexity: O(1)

class RB190 {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result += (n & 1);
            n >>>= 1;
        }
        return result;
    }
}
