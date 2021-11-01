import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Top17 {
    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        int n = digits.length();
        HashMap<Character, String> hashMap = new HashMap<>();
        hashMap.put('2', "abc");
        hashMap.put('3', "def");
        hashMap.put('4', "ghi");
        hashMap.put('5', "jkl");
        hashMap.put('6', "mno");
        hashMap.put('7', "pqrs");
        hashMap.put('8', "tuv");
        hashMap.put('9', "wxyz");
        if (n > 0){
            for (int i = 0; i < hashMap.get(digits.charAt(0)).length(); i++) {
                if (n > 1){
                    for (int j = 0; j < hashMap.get(digits.charAt(1)).length(); j++) {
                        if (n > 2){
                            for (int k = 0; k < hashMap.get(digits.charAt(2)).length(); k++) {
                                if (n > 3){
                                    for (int l = 0; l < hashMap.get(digits.charAt(3)).length(); l++) {
                                        list.add(new String(String.valueOf(hashMap.get(digits.charAt(0)).charAt(i))+String.valueOf(hashMap.get(digits.charAt(1)).charAt(j))+String.valueOf(hashMap.get(digits.charAt(2)).charAt(k))+String.valueOf(hashMap.get(digits.charAt(3)).charAt(l))));
                                    }
                                }else
                                    list.add(new String(String.valueOf(hashMap.get(digits.charAt(0)).charAt(i))+String.valueOf(hashMap.get(digits.charAt(1)).charAt(j))+String.valueOf(hashMap.get(digits.charAt(2)).charAt(k))));
                            }
                        }else
                            list.add(new String(String.valueOf(hashMap.get(digits.charAt(0)).charAt(i))+String.valueOf(hashMap.get(digits.charAt(1)).charAt(j))));
                    }
                }else
                    list.add(new String(String.valueOf(hashMap.get(digits.charAt(0)).charAt(i))));
            }
        }


        return list;
    }
}
