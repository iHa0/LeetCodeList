package Top100;

import java.util.Arrays;

public class Top406 {
    public int[][] reconstructQueue(int[][] people) {
        int h = people.length;
        int[][] res = new int[h][2];
        Arrays.sort(people, (o1, o2) ->
            o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]
        );
        int[] flag = new int[h];
        for (int i = 0; i < h; i++) {
            flag[i] = people[i][1];
        }
        int left, count = 0;
        for (int i = 0; i < h; i++) {
            left = 0;
            while (left < h && people[left][1] != 0){
                if (people[left][1] == Integer.MIN_VALUE){
                    left++;
                    continue;
                }
                people[left++][1]--;
            };
            res[count][0] = people[left][0];
            res[count][1] = flag[left];
            people[left][1] = Integer.MIN_VALUE;
            int temp = people[left][0];
            while (left < h && people[left][0] == temp){
                if (people[left][1] == Integer.MIN_VALUE){
                    left++;
                    continue;
                }
                people[left++][1]--;
            }
            count++;
        }
        return res;
    }
}
