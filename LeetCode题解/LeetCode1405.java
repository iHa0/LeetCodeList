package Review;

import java.util.PriorityQueue;

public class LeetCode1405 {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
        if (a >= 0) priorityQueue.add(new int[]{0, a});
        if (b >= 0) priorityQueue.add(new int[]{1, b});
        if (c >= 0) priorityQueue.add(new int[]{2, c});
        StringBuilder sb = new StringBuilder();
        while (!priorityQueue.isEmpty()){
            int[] max = priorityQueue.poll();
            int[] mid = priorityQueue.poll();
            int[] min = priorityQueue.poll();
            if (max[1] == 0 && mid[1] == 0 && min[1] == 0) break;
            if (mid[1] == 0 && min[1] == 0){
                if (max[1] >= 2){
                    sb.append((char) (max[0] + 'a'));
                    sb.append((char) (max[0] + 'a'));
                } else {
                    sb.append((char) (max[0] + 'a'));
                }
                break;
            }
            int maxl = max[1], midl = mid[1], minl = min[1];
            if (max[1] >= 2){
                sb.append((char) (max[0] + 'a'));
                sb.append((char) (max[0] + 'a'));
                maxl -= 2;
            } else {
                sb.append((char) (max[0] + 'a'));
                maxl -= 1;
            }
            if ((maxl + 1) / 2 < (midl + minl) && mid[1] >= 2){
                sb.append((char) (mid[0] + 'a'));
                sb.append((char) (mid[0] + 'a'));
                midl -= 2;
            } else if ((maxl + 1) / 2 >= (midl + minl) || mid[1] < 2){
                sb.append((char) (mid[0] + 'a'));
                midl -= 1;
            }
            priorityQueue.add(new int[]{max[0], maxl});
            priorityQueue.add(new int[]{mid[0], midl});
            priorityQueue.add(new int[]{min[0], minl});
        }
        return sb.toString();
    }
}
