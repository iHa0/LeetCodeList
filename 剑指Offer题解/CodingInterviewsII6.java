public class CodingInterviewsII6 {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int[] res = new int[2];
        for (int i = 0, j = len - 1; i < j;) {
            if (numbers[i] + numbers[j] == target){
                res[0] = i;
                res[1] = j;
                break;
            }
            if (numbers[i] + numbers[j] > target)
                j--;
            if (numbers[i] + numbers[j] < target)
                i++;
        }
        return res;
    }
}
