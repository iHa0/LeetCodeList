public class LeetCode838 {
    public String pushDominoes(String dominoes) {
        int len = dominoes.length();
        char[] chars = dominoes.toCharArray();
        int left = 0, right = 0;
        while (right < len && chars[right] == '.')
            right++;
        if (right < len && chars[right] == 'L') {
            for (int i = left; i < right; i++) {
                chars[i] = 'L';
            }
        }
        left = right;
        right++;
        while (right < len){
            while (right < len && chars[right] == '.'){
                right++;
            }
            if (right < len && chars[left] == chars[right]){
                for (int i = left + 1; i < right; i++) {
                    chars[i] = chars[left];
                }
                left = right++;
                continue;
            }
            if (right < len && chars[right] == 'L' && chars[left] == 'R'){
                int start = left + 1, end = right - 1;
                while (start <= end){
                    if (start == end){
                        chars[start] = '.';
                        break;
                    }
                    chars[start++] = chars[left];
                    chars[end--] = chars[right];
                }
                left = right++;
                continue;
            }
            if (right < len && chars[right] == 'R' && chars[left] == 'L'){
                left = right++;
                continue;
            }
        }
        if (left < len && chars[left] == 'R'){
            for (int i = left; i < len; i++) {
                chars[i] = 'R';
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char a : chars) {
            sb.append(a);
        }
        return sb.toString();
    }
}
