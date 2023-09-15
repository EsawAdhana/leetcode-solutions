// Question #33: Search in Rotated Sorted Array
// Time complexity: O(log(n)) && Space complexity: O(1)

class SIRA33 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;

            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) end = mid - 1;
                else start = mid + 1;
            } else {
                if (nums[end] >= target && nums[mid] < target) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
