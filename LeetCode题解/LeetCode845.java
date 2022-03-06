public class LeetCode845 {
    public int longestMountain(int[] arr) {
        int len = arr.length;
        if (len < 3)
            return 0;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = 1;
        right[len - 1] = 1;
        for (int i = 1; i < len; i++) {
            if (arr[i] > arr[i - 1])
                left[i] = left[i - 1] + 1;
            else
                left[i] = 1;
        }
        for (int i = len - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1])
                right[i] = right[i + 1] + 1;
            else
                right[i] = 1;
        }
        int max = 0;
        for (int i = 0; i < len; i++) {
            if (left[i] == 1 || right[i] == 1)
                continue;
            max = Math.max(max, left[i] + right[i] - 1);
        }
        return max == 1 ? 0 : max;
    }
}
