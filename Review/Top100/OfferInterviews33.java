class Solution {
    public boolean verifyPostorder(int[] postorder) {
        int len = postorder.length;
        if (len < 2) return true;
        return dfs(postorder, 0, len - 1);
    }

    private boolean dfs(int[] postorder, int left, int right) {
        if (left >= right) return true;
        int rootVal = postorder[right];
        int k = left;
        while (postorder[k] < rootVal) k++;
        for (int i = k; i < right; i++) {
            if (postorder[i] <= rootVal) return false;
        }
        if (!dfs(postorder, left, k - 1)) return false;
        if (!dfs(postorder, k, right - 1)) return false;
        return true;
    }
}
