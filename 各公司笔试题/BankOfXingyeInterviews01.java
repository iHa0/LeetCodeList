import java.util.Scanner;

public class Xingye {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] nums = input.split(",");
        int sum = 0, temp_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            temp_sum += Integer.parseInt(nums[i]);
        }
        for (int i = 0; i < nums.length + 1; i++) {
            sum += i;
        }
        System.out.println(sum - temp_sum);
    }
}
