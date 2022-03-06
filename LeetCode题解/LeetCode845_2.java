public class LeetCode845_2 {
    public int longestMountain(int[] arr) {
        int len = arr.length;
        if (len < 3)
            return 0;
        int max = 0;
        for (int i = 1; i < len - 1; i++) {
            int left = i - 1, right = i + 1;
            if (arr[left] >= arr[i] || arr[right] >= arr[i])
                continue;
            while (left >= 0 && arr[left] < arr[left + 1])
                left--;
            while (right < len && arr[right] < arr[right - 1])
                right++;
            max = Math.max(max, right - left - 1);
        }
        return max;
    }
}
