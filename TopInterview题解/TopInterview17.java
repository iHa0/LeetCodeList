package TopInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TopInterview17 {
    int len;
    List<String> res;
    HashMap<Character, String> hashMap;
    public List<String> letterCombinations(String digits) {
        this.len = digits.length();
        this.res = new ArrayList<>();
        this.hashMap = new HashMap<>();
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
        back(digits, list, 0);
        return res;
    }

    public void back(String s, LinkedList<Character> list, int index){
        if (list.size() == s.length()){
            String sTemp = "";
            for (char ch:
                 list) {
                sTemp += ch;
            }
            res.add(sTemp);
            return;
        }
        char a = s.charAt(index);
        String temp = hashMap.get(a);
        for (int i = 0; i < temp.length(); i++) {
            list.add(temp.charAt(i));
            back(s, list, index + 1);
            list.removeLast();
        }
    }
}
