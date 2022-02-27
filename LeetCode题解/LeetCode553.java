public class LeetCode553 {
    public String optimalDivision(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return String.valueOf(nums[0]);
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0] + "/");
        if (len > 2)
            sb.append("(");
        for (int i = 1; i < len; i++) {
            sb.append(nums[i]);
            if (i != len - 1)
                sb.append("/");
            else
                if (len > 2)
                    sb.append(")");
        }
        return sb.toString();
    }
}
