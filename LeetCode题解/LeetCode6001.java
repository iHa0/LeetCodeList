package Review;

import java.util.ArrayList;
import java.util.Collections;

public class LeetCode6001 {
    public long smallestNumber(long num) {
        ArrayList<Long> arrayList = new ArrayList<>();
        int flag = num < 0 ? -1 : 1;
        num = Math.abs(num);
        if (num == 0){
            arrayList.add(num);
        }
        while (num > 0){
            arrayList.add(num % 10);
            num /= 10;
        }
        Collections.sort(arrayList);
        long res = 0;
        if (flag == 1){
            if (arrayList.get(0) == 0 && arrayList.size() > 1){
                int zeroindex = 0;
                long tims = 1;
                while (arrayList.get(zeroindex) == 0){
                    zeroindex++;
                    tims *= 10;
                }
                res += arrayList.get(zeroindex) * tims;
                int index = zeroindex + 1;
                while (index < arrayList.size()){
                    res = res * 10 + arrayList.get(index++);
                }
            } else {
                int index = 0;
                while (index < arrayList.size()){
                    res = res * 10 + arrayList.get(index++);
                }
            }
        } else {
            int index = arrayList.size() - 1;
            while (index >= 0){
                res = res * 10 + arrayList.get(index--);
            }
            res = - res;
        }
        return res;
    }
}
