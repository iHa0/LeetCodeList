public class Top11 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, res = 0;
        while (left < right){
            res = Math.max(res, height[left] > height[right]? (right - left) * height[right--]: (right - left) * height[left++]);
        }
        return res;
    }
}
