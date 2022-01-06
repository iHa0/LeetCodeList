package TopInterview;

public class TopInterview162 {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if (len == 1 && nums[0] != Integer.MIN_VALUE)
            return 0;
        int[] numsNew = new int[len + 2];
        numsNew[0] = Integer.MIN_VALUE;
        numsNew[len + 1] = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            numsNew[i + 1] = nums[i];
        }
        int left = 1, right = len, mid;
        while (left <= right){
            mid = (left + right) / 2;
            if (numsNew[mid] > numsNew[mid - 1] && numsNew[mid] > numsNew[mid + 1])
                return mid - 1;
            if (numsNew[mid] > numsNew[mid - 1] || numsNew[mid] < numsNew[mid + 1]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
