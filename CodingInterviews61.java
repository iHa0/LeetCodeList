public class CodingInterviews61 {
    public boolean isStraight(int[] nums) {
        int[] count = new int[14];
        int left = 0, right = 0, m = 0;
        for (int epoch:
             nums) {
            count[epoch] ++;
        }
        for (int i = 1; i < 14; i++) {
            if (count[i] >= 2){
                return false;
            }
            if (count[i] == 1 && left == 0){
                left = i;
            }
            if (count[i] == 1){
                right = i;
            }

        }
        for (int i = left; i < right; i++) {
            if (count[i] == 0)
                m ++;
        }
        if ((((right > 0 && left > 0) ? (right - left) + 1 : 0) - m + count[0]) == 5 && m <= count[0]){
            return true;
        }else {
            return false;
        }
    }
}
