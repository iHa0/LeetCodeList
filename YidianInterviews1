import java.util.ArrayList;

public class Yidian {
    public int[] max_version (String[][] version_list){
        ArrayList<Integer> arrayList = new ArrayList<>();
        String a, b;
        int len = version_list.length, m = 0, n =0, sum_a = 0, sum_b = 0, flag = 1;
        for (int i = 0; i < len; i++) {
            a = version_list[i][0];
            b = version_list[i][1];
            while (n < a.length() && m < b.length()){
                while (n < a.length() && a.charAt(n) != '.'){
                    sum_a *= 10;
                    sum_a += a.charAt(n) - '0';
                    n ++;
                }
                while (m < b.length() && b.charAt(m) != '.'){
                    sum_b *= 10;
                    sum_b += b.charAt(m) - '0';
                    m ++;
                }
                if (sum_a < sum_b){
                    flag = 2;
                    break;
                }else if (sum_a > sum_b){
                    flag = 1;
                    break;
                }
                sum_a = 0;
                sum_b = 0;
                m++;
                n++;
            }
            if ((n - 1) == a.length() && (m - 1) < b.length() && flag == 1){
                flag = 2;
            }
            arrayList.add(flag);
            flag = 1;
            sum_a = 0;
            sum_b = 0;
            m = 0;
            n = 0;
        }
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }
}
