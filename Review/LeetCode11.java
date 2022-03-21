class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0, right = len - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, height[left] > height[right] ? (right - left) * height[right--] : (right - left) * height[left++]);
        }
        return max;
    }
}
