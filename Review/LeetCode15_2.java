class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (len <= 2) return res;
        int pivot = 0, left, right;
        while (pivot < len - 2) {
            int target = 0 - nums[pivot];
            left = pivot + 1;
            right = len - 1;
            while (left < right) {
                int a = nums[left];
                int b = nums[right];
                if (a + b == target) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[pivot]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    res.add(temp);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                if (a + b < target) {
                    left++;
                } else if (a + b > target){
                    right--;
                }
            }
            pivot++;
            while (pivot < len - 2 && nums[pivot] == nums[pivot - 1]) pivot++;
        }
        return res;
    }
}
