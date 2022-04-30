class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> majorityElement(int[] nums) {
        int index1 = nums[0], count1 = 0;
        int index2 = nums[0], count2 = 0;
        for (int num : nums) {
            if (index1 == num) {
                count1++;
                continue;
            }
            if (index2 == num) {
                count2++;
                continue;
            }
            if (count1 == 0) {
                index1 = num;
                count1++;
                continue;
            }
            if (count2 == 0) {
                index2 = num;
                count2++;
                continue;
            }
            count1--;
            count2--;
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == index1) count1++;
            else if (num == index2) count2++;
        }
        if (count1 > nums.length / 3) res.add(index1);
        if (count2 > nums.length / 3) res.add(index2);
        return res;
    }
}
