import java.util.ArrayList;

public class JiangsuDianxing3 {
    public String[] getWordsChain(String[] words){
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(words[0]);
        char tar = words[0].charAt(words[0].length() - 1);
        words[0] = "";
        int flag = 0, min = 27, i ,j;
        for (i = 1; i < words.length; i++) {
            min = 27;
            flag = 0;
            for (j = 1; j < words.length; j++) {
                if (words[j].length() == 0)
                    continue;
                if (words[j].length() > 0 && min > (words[j].charAt(0) - tar + 26) % 26){
                    min = (words[j].charAt(0) - tar + 26) % 26;
                    flag = j;
                }
            }
            arrayList.add(words[flag]);
            tar = words[flag].charAt(words[flag].length() - 1);
            words[flag] = "";
        }
        String[] res = new String[arrayList.size()];
        int n = 0;
        for (String a:
             arrayList) {
            res[n++] = a;
        }
        return res;
    }
}
