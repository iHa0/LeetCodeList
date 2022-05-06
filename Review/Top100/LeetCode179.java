class Solution {
    public String largestNumber(int[] nums) {
        int len = nums.length;
        String[] ss = new String[len];
        for (int i = 0; i < len; i++) {
            ss[i] = nums[i] + "";
        }
        Arrays.sort(ss, (o1, o2) -> {
            String ab = o1 + o2, ba = o2 + o1;
            return ba.compareTo(ab);
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < len; i++) {
            if (i == 0 && ss[i].equals("0")) return "0";
            sb.append(ss[i]);
        }
        return sb.toString();
    }
}
