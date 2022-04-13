class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = height[0];
        right[len - 1] = height[len - 1];
        int res = 0;
        for (int i = 1; i < len; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        for (int i = len - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
            res += Math.min(right[i], left[i]) - height[i];
        }
        return res;
    }
}
