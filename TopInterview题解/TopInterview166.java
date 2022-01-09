package TopInterview;

import java.util.HashMap;

public class TopInterview166 {
    public String fractionToDecimal(int numerator, int denominator) {
        long a = numerator, b = denominator;
        if (a % b == 0)
            return String.valueOf(a / b);
        StringBuffer sb = new StringBuffer();
        if (a * b < 0)
            sb.append("-");
        a = Math.abs(a);
        b = Math.abs(b);
        sb.append(String.valueOf(a / b) + ".");
        a %= b;
        HashMap<Long, Integer> hashMap = new HashMap<>();
        while (a != 0){
            hashMap.put(a, sb.length());
            a *= 10;
            sb.append(a / b);
            a %= b;
            if (hashMap.containsKey(a)){
                int u = hashMap.get(a);
                return String.format("%s(%s)", sb.substring(0, u), sb.substring(u));
            }
        }
        return sb.toString();
    }
}

