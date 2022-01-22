package TopInterview;

import java.util.ArrayList;
import java.util.Random;

public class TopInterview384 {
    ArrayList<Integer> arrayList;
    int[] temp;
    int len;
    Random random = new Random();

    public TopInterview384(int[] nums) {
        this.len = nums.length;
        this.temp = new int[len];
        for (int i = 0; i < len; i++) {
            temp[i] = nums[i];
        }
        this.arrayList = new ArrayList<>();
    }

    public int[] reset() {
        return temp;
    }

    public int[] shuffle() {
        for (int a : temp) {
            arrayList.add(a);
        }
        int[] res = new int[len];
        int n = 0;
        while (arrayList.size() > 0){
            int rand = random.nextInt(arrayList.size());
            res[n++] = arrayList.get(rand);
            arrayList.remove(rand);
        }
        return res;
    }
}
