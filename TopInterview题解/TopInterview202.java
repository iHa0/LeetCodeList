package Top100;

import java.util.HashSet;

public class TopInterview202 {
    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        int count = n, temp;
        while (true){
            if (count == 1)
                return true;
            temp = 0;
            while (count != 0){
                temp += (count % 10) * (count % 10);
                count /= 10;
            }
            if (hashSet.contains(temp))
                return false;
            hashSet.add(temp);
            count = temp;
        }
    }
}
