package TopInterview;

import java.util.HashMap;

public class TopInterview13 {
    public int romanToInt(String s) {
        int res = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        int len = s.length(), sum = 0, index = 0;
        while (index < len - 1){
            char a = s.charAt(index);
            char b = s.charAt(index + 1);
            if (hashMap.get(a) < hashMap.get(b)){
                sum += (hashMap.get(b) - hashMap.get(a));
                index += 2;
            }else {
                sum += hashMap.get(a);
                index++;
            }
        }
        if (index == len - 1){
            sum += hashMap.get(s.charAt(index));
        }
        return sum;
    }
}
