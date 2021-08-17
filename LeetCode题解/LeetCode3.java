public int lengthOfLongestSubstring(String s) {
        int[] record = new int[128];
        Arrays.fill(record , -1);
        int fast = 0 , slow = 0 , max = 0;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (record[ch] > -1){
                slow = Math.max(slow , record[ch] + 1);
            }
            record[ch] = fast ++;
            max = Math.max(max , fast - slow);
        }
        return max;
    }
