import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Top17_2 {
    List<String> res = new LinkedList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return res;
        HashMap<Character, String> hashMap = new HashMap<>();
        hashMap.put('2', "abc");
        hashMap.put('3', "def");
        hashMap.put('4', "ghi");
        hashMap.put('5', "jkl");
        hashMap.put('6', "mno");
        hashMap.put('7', "pqrs");
        hashMap.put('8', "tuv");
        hashMap.put('9', "wxyz");
        int len = digits.length();
        LinkedList<Character> list = new LinkedList<>();
        back(hashMap, 0, list, digits);
        return res;
    }

    public void back(HashMap<Character, String> hashMap, int index,
                     LinkedList<Character> list, String s){
        if (list.size() == s.length()){
            String temp = "";
            for (char a:
                 list) {
                temp += a;
            }
            res.add(temp);
            return;
        }
        String letters = hashMap.get(s.charAt(index));
        for (int i = 0; i < letters.length(); i++) {
            list.add(letters.charAt(i));
            back(hashMap, index + 1, list, s);
            list.removeLast();
        }
    }
}
