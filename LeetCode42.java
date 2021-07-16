public class LeetCode42 {

    public int trap(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (height[left] < height[right]) {
                ans += leftMax - height[left];
                ++left;
            } else {
                ans += rightMax - height[right];
                --right;
            }
        }
        return ans;
    }

    // 以下答案待改进，不是完全正确
    public int trap2(int[] height) {
        int res = 0, temp = 0, max = 0, flag = 0, temp2 = 0;
        int len = height.length;
        if (len <= 2)
            return 0;
        int i = 0, j = 0;
        while (height[i] == 0 && i < len - 1)
            i++;
        while (i < len - 1){
            for (j = i + 1, max = height[j]; j < len; j++) {
                temp += height[j];
                if (height[j] > max){
                    max = height[j];
                    flag = j;
                    temp2 = temp;
                }
                if (height[j] >= height[i]){
                    int add = (j - i - 1) * Math.min(height[i], height[j]) - temp + height[j];
                    res += add;
                    temp = 0;
                    i = j;
                    break;
                }
            }
            if (flag > 0){
                int addd = (flag - i - 1) * height[flag] - temp2 + height[flag];
                res += addd;
                i = flag;
            }

            i ++;
            temp = 0;
            temp2 = 0;
            flag = 0;
        }
        return res;
    }
}
