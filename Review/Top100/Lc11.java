package Top100Review;

public class Lc11 {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int len = height.length;
        int left = 0, right = len - 1;
        while (left < right){
            max = Math.max(max, height[left] > height[right] ? ((right - left) * height[right--]) : (right - left) * height[left++]);
        }
        return max;
    }
}
