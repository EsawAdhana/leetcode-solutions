import java.util.*;

class CWMW11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = Integer.MIN_VALUE;

        while (left < right) {
            int min = Math.min(height[left], height[right]);
            int area = min * (right - left);
            maxArea = Math.max(area, maxArea);
            if (min == height[left]) ++left;
            else --right;
        }
        return maxArea;
    }
}