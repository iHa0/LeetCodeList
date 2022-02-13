import java.util.HashMap;

public class LeetCode1189 {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('a', 0);
        hashMap.put('b', 0);
        hashMap.put('l', 0);
        hashMap.put('o', 0);
        hashMap.put('n', 0);
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        int a = hashMap.get('a');
        int b = Math.min(a, hashMap.get('b'));
        int l = Math.min(b, hashMap.get('l') / 2);
        int o = Math.min(l, hashMap.get('o') / 2);
        int n = Math.min(o, hashMap.get('n'));
        return n;
    }
}
