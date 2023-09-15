// Question #338: Counting Bits
// Time complexity: O(n) && Space complexity: O(1)

class CB338 {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) arr[i] = arr[i / 2] + i % 2;
        return arr;
    }
}
