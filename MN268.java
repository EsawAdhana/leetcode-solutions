class MN268 {
    public int missingNumber(int[] nums) {
        int num = (nums.length * (nums.length + 1)) / 2;
        for (int i = 0; i < nums.length; i++) num -= nums[i];
        return num;
    }
}