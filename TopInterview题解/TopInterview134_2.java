package TopInterview;

public class TopInterview134_2 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int free = 0;
        int min = Integer.MAX_VALUE;
        int min_index = 0;
        for (int i = 0; i < len; i++) {
            free += gas[i] - cost[i];
            if (free < min){
                min = free;
                min_index = i;
            }
        }
        return free < 0 ? -1 : (min_index + 1) % len;
    }
}
