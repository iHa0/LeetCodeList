package Review;

import java.util.ArrayList;

public class LeetCode0101 {
    public boolean isUnique(String astr) {
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < astr.length(); i++) {
            char a = astr.charAt(i);
            if (arrayList.contains(a))
                return false;
            else
                arrayList.add(a);
        }
        return true;
    }
}
