class Solution {
    public int findNthDigit(int n) {
        int time = 1;
        long start = 1, count = 9;
        while (n > count) {
            n -= count;
            time++;
            start *= 10;
            count = time * start * 9;
        }
        long num = start + (n - 1) / time;
        return Long.toString(num).charAt((n - 1) % time) - '0';
    }
}
