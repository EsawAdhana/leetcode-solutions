// Question #217: Contains Duplicate
// Time complexity: O(n) && Space complexity: O(1)

import java.util.HashMap;

class CD217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) return true;
            map.put(nums[i], 0);
        }
        return false;
    }
}
