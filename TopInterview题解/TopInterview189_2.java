package TopInterview;
/*
nums = "----->-->"; k =3
result = "-->----->";

reverse "----->-->" we can get "<--<-----"
reverse "<--" we can get "--><-----"
reverse "<-----" we can get "-->----->"
this visualization help me figure it out :)
*/
public class TopInterview189_2 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        re(0, len - 1, nums);
        re(0, k - 1, nums);
        re(k, len - 1, nums);

    }
  
    public void re(int i, int j, int[] nums){
        while (i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
