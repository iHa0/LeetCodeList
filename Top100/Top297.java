package Top100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Top297 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String res = "";
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        queue.add(root);
        int count = 0;
        arrayList.add(String.valueOf(root.val));
        while (!queue.isEmpty()){
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode p = queue.poll();
                count++;
                if (p.left != null){
                    arrayList.add(String.valueOf(p.left.val));
                    queue.add(p.left);
                }else {
                    arrayList.add("null");
                }
                if (p.right != null){
                    arrayList.add(String.valueOf(p.right.val));
                    queue.add(p.right);
                }else {
                    arrayList.add("null");
                }
            }
        }
        res += arrayList.get(0);
        int now = 0;
        for (int i = 1; now < count - 1; i++) {
            if (!arrayList.get(i).equals("null"))
                now++;
            res += ("," + arrayList.get(i));
        }
        return res;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() <= 0)
            return null;
        String[] split = data.split(",");
        TreeNode head = new TreeNode(Integer.parseInt(split[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        int cur = 1;
        while (!queue.isEmpty() && cur < split.length){
            TreeNode temp = queue.poll();
            if (cur < split.length && split[cur].equals("null")){
                temp.left = null;
                cur++;
            }else {
                if (cur < split.length){
                    temp.left = new TreeNode(Integer.parseInt(split[cur++]));
                    queue.add(temp.left);
                }
            }
            if (cur < split.length && split[cur].equals("null")){
                temp.right = null;
                cur++;
            }else {
                if (cur < split.length){
                    temp.right = new TreeNode(Integer.parseInt(split[cur++]));
                    queue.add(temp.right);
                }
            }
        }
        return head;
    }
}
