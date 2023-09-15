// Question #191: Number of 1(One) Bits
// Time complexity: O(1) && Space complexity: O(1)

class NOOB191 {
    public int hammingWeight(int n) {
        int ones = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) ++ones;
            n >>= 1;
        }
        return ones;
    }
}
