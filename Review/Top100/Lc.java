package Top100Review;

import java.util.*;

public class Lc17 {
    int len;
    String digits;
    List<String> res = new ArrayList<>();
    HashMap<Character, String> hashMap = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        this.len = digits.length();
        this.digits = digits;
        if (len <= 0)
            return res;
        hashMap = new HashMap<>();
        hashMap.put('2', "abc");
        hashMap.put('3', "def");
        hashMap.put('4', "ghi");
        hashMap.put('5', "jkl");
        hashMap.put('6', "mno");
        hashMap.put('7', "pqrs");
        hashMap.put('8', "tuv");
        hashMap.put('9', "wxyz");
        LinkedList<Character> list = new LinkedList<>();
        back(list, 0);
        return res;
    }

    private void back(LinkedList<Character> list, int index) {
        if (list.size() == len){
            StringBuilder sb = new StringBuilder();
            for (Character a : list) {
                sb.append(a);
            }
            res.add(sb.toString());
            return;
        }
        String cur = hashMap.get(digits.charAt(index));
        for (char a : cur.toCharArray()) {
            list.add(a);
            back(list, index + 1);
            list.removeLast();
        }
    }
}
