class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int left = 0, right = len - 1, leftMax = Integer.MIN_VALUE, rightMax = Integer.MIN_VALUE, res = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (leftMax < height[left]) leftMax = height[left];
                else res += leftMax - height[left];
                left++;
            } else {
                if (rightMax < height[right]) rightMax = height[right];
                else res += rightMax - height[right];
                right--;
            }
        }
        return res;
    }
}
