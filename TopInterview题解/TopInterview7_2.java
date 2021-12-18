package TopInterview;

public class TopInterview7_2 {
    public int reverse(int x) {
        if (x == 0)
            return 0;
        long res = 0;
        boolean flag = true;
        if (x < 0){
            flag = false;
            x = -x;
        }
        while (x > 0){
            int temp = x % 10;
            res = res * 10 + temp;
            x /= 10;
        }
        if (flag == false){
            res = - res;
            if (res < -Math.pow(2, 31))
                return 0;
            return (int)res;
        }
        if (res > Math.pow(2, 31) - 1){
            return 0;
        }
        return (int)res;
    }
}
