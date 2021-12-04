package Top100;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Top253 {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0)
            return 0;
        if (intervals.length == 1)
            return 1;
        Arrays.sort(intervals, (o1, o2)-> o1[0] - o2[0]);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= priorityQueue.peek()){
                priorityQueue.poll();
            }
            priorityQueue.add(intervals[i][1]);
        }
        return priorityQueue.size();
    }
}
