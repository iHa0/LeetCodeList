class Solution {
    public int orangesRotting(int[][] grid) {
        int h = grid.length, l = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (grid[i][j] == 1) {
                    count++;
                } else if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        int round = 0;
        while (count > 0 && !queue.isEmpty()) {
            round++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] orange = queue.poll();
                int h1 = orange[0], l1 = orange[1];
                if (h1 - 1 >= 0 && grid[h1 - 1][l1] == 1) {
                    grid[h1 - 1][l1] = 2;
                    queue.add(new int[]{h1 - 1, l1});
                    count--;
                }
                if (h1 + 1 < h && grid[h1 + 1][l1] == 1) {
                    grid[h1 + 1][l1] = 2;
                    queue.add(new int[]{h1 + 1, l1});
                    count--;
                }
                if (l1 - 1 >= 0 && grid[h1][l1 - 1] == 1) {
                    grid[h1][l1 - 1] = 2;
                    queue.add(new int[]{h1, l1 - 1});
                    count--;
                }
                if (l1 + 1 < l && grid[h1][l1 + 1] == 1) {
                    grid[h1][l1 + 1] = 2;
                    queue.add(new int[]{h1, l1 + 1});
                    count--;
                }
            }
        }
        if (count > 0) return -1;
        return round;
    }
}
