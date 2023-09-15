// Question #238: Product Of Array Except Self
// Time complexity: O(n) && Space complexity: O(1)

class POAES238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int curr = 1;

        for (int i = 0; i < n; i++) {
            ans[i] = curr;
            curr *= nums[i];
        }

        curr = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }

        return ans;

    }
}
