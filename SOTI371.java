// Question #371: Sum of Two Integers
// Time complexity: O(1) && Space complexity: O(1)

class SOTI371 {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}
