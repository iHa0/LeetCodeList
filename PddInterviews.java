import java.util.LinkedList;
import java.util.Scanner;

public class PddInterviews1 {
    static int sum = 0;
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] in = new int[n];
        for (int i = 0; i < n; i++) {
            in[i] = scanner.nextInt();
        }
        LinkedList<Integer> track = new LinkedList<>();
        LinkedList<Integer> visted = new LinkedList<>();
        back(in, track, visted, m);
        System.out.println(sum % 100);


    }

    static void back(int[] nums, LinkedList<Integer> track, LinkedList<Integer> visted, int m){
        if (track.size() == nums.length) {
            // TODO: 2021/8/8 判断
            if (isReturn(track, m)) {
                sum++;
                return;
            }
        }
            for (int i = 0; i < nums.length; i++) {
                if (visted.contains(i)) {
                    continue;
                }
                visted.add(i);
                track.add(nums[i]);
                back(nums, track, visted, m);
                visted.removeLast();
                track.removeLast();
            }

    }

    static boolean isReturn(LinkedList<Integer> track, int m){
        for (int i = 0; i < track.size() - 1; i++) {
            int a = track.get(i), b = track.get(i + 1);
            if (a > b){
                if ((a - b) > m){
                    return false;
                }
            }
        }
        return true;
    }
}
