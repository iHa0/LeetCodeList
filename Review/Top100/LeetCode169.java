public class LeetCode169 {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int index = 0, count = 0;
        for (int a : nums) {
            if (count == 0){
                index = a;
                count++;
                continue;
            }
            if (index != a){
                count--;
            } else {
                count++;
            }
        }
        return index;
    }
}
