class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int l1 = num1.length(), l2 = num2.length();
        int[] res = new int[l1 + l2];
        for (int i = l1 - 1; i >= 0; i--) {
            int a = num1.charAt(i) - '0';
            for (int j = l2 - 1; j >= 0; j--) {
                int b = num2.charAt(j) - '0';
                int sum = a * b + res[i + j + 1];
                res[i + j] += sum / 10;
                res[i + j + 1] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            if (i == 0 && res[i] == 0) continue;
            sb.append(res[i]);
        }
        return sb.toString();
    }
}
