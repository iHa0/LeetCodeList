import java.util.ArrayList;
import java.util.List;

public class LeetCode969 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> pancakeSort(int[] arr) {
        int len = arr.length;
        int end = len - 1, start = 0;
        for (int i = len; i >= 1; i--) {
            int j;
            for (j = 0; arr[j] != i; j++);
            swap(arr, start, j);
            if (j != 0)
                res.add(j + 1);
            swap(arr, start, i - 1);
            res.add(i);
        }
        return res;
    }

    private void swap(int[] arr, int start, int end) {
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
