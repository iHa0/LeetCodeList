public class CodingInterviews13 {
    public int romanToInt(String s) {
        s = s.replaceAll("IV", "A");
        s = s.replaceAll("IX", "B");
        s = s.replaceAll("XL", "E");
        s = s.replaceAll("XC", "F");
        s = s.replaceAll("CD", "J");
        s = s.replaceAll("CM", "K");
        int len = s.length();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            switch (s.charAt(i)){
                case 'I': nums[i] = 1;
                    break;
                case 'V': nums[i] = 5;
                    break;
                case 'X': nums[i] = 10;
                    break;
                case 'L': nums[i] = 50;
                    break;
                case 'C': nums[i] = 100;
                    break;
                case 'D': nums[i] = 500;
                    break;
                case 'M': nums[i] = 1000;
                    break;
                case 'A': nums[i] = 4;
                    break;
                case 'B': nums[i] = 9;
                    break;
                case 'E': nums[i] = 40;
                    break;
                case 'F': nums[i] = 90;
                    break;
                case 'J': nums[i] = 400;
                    break;
                case 'K': nums[i] = 900;
                    break;
            }
        }
        int sum = 0;
        for (int temp:
             nums) {
            sum += temp;
        }
        return sum;
    }
}
