public class LeetCode165 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len1 = v1.length, len2 = v2.length;
        int index = 0;
        while (index < len1 && index < len2) {
            int a = Integer.valueOf(v1[index]);
            int b = Integer.valueOf(v2[index]);
            index++;
            if (a > b){
                return 1;
            } else if (a < b) {
                return -1;
            }
        }
        if (index < len1) {
            for (int i = index; i < len1; i++) {
                if (Integer.valueOf(v1[i]) > 0)
                    return 1;
            }
        }
        if (index < len2) {
            for (int i = index; i < len2; i++) {
                if (Integer.valueOf(v2[i]) > 0)
                    return -1;
            }
        }
        return 0;
    }
}
