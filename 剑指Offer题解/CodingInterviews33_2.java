class Solution {
    public boolean verifyPostorder(int[] postorder) {
        int len = postorder.length;
        if (len < 2) return true;
        return verify(postorder, 0, len - 1);
    }

    private boolean verify(int[] postorder, int left, int right) {
        if (left >= right) return true;
        int rootVal = postorder[right];
        int k = left;
        while (k < right && postorder[k] < rootVal) k++;
        for (int i = k; i < right; i++) {
            if (postorder[i] < rootVal) return false;
        }
        if (!verify(postorder, left, k - 1)) return false;
        if (!verify(postorder, k, right - 1)) return false;
        return true;
    }
}
