// Question #1: Two Sum
// Time complexity: O(n) && Space complexity: O(n)

import java.util.HashMap;

class TS1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) return new int[]{i, map.get(target - nums[i])};
            map.put(nums[i], i);
        }
        return null;
    }
}
