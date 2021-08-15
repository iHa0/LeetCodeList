import java.util.*;

public class MihayouInterviews2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> a = new HashMap<>();
        HashMap<Integer, Integer> b = new HashMap<>();
        for (int i = 0, j = 1; i < len && j < len;) {
            a.put(nums[i], a.getOrDefault(nums[i], 0) + 1);
            b.put(nums[j], b.getOrDefault(nums[j], 0) + 1);
            i += 2;
            j += 2;
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(a.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            //降序排序
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                //return o1.getValue().compareTo(o2.getValue());
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        List<Map.Entry<Integer, Integer>> list2 = new ArrayList<Map.Entry<Integer, Integer>>(b.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            //降序排序
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                //return o1.getValue().compareTo(o2.getValue());
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int a_max = (int) a.keySet().toArray()[0];
        int b_max = (int) b.keySet().toArray()[0];
        int sum = 0;
        for (int i = 0, j = 1; i < len && j < len;) {
            if (nums[i] != a_max)
                sum ++;
            if (nums[j] != b_max)
                sum ++;
            j += 2;
            i += 2;
        }
        System.out.println(sum);
    }
}
