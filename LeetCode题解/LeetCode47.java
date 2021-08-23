import java.util.*;

public class LeetCode47 {
    private static boolean[] visited;
    private static List<List<Integer>> res = new LinkedList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        visited = new boolean[n];
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        LinkedList<Integer> track = new LinkedList<>();
        back(track, nums);
        for (List<Integer> temp:
             res) {
            for (int i = 0; i < temp.size(); i++) {
                System.out.print(temp.get(i) + " ");
            }
            System.out.println();
        }

    }
    static void back(LinkedList<Integer> track, int[] nums){
        if (track.size() == nums.length){
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]))
                continue;
            track.add(nums[i]);
            visited[i] = true;
            back(track, nums);
            visited[i] = false;
            track.removeLast();
        }
    }
}
