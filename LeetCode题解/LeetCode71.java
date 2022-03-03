import java.util.*;

public class LeetCode71 {
    public String simplifyPath(String path) {
        Deque<String> queue = new ArrayDeque<>();
        String[] strings = path.split("/");
        for (String a : strings) {
            if (a.length() == 0 || a.equals("/") || a.equals("."))
                continue;
            if (queue.isEmpty() && a.equals(".."))
                continue;
            if (a.equals("..")){
                queue.removeLast();
                continue;
            } else {
                queue.add(a);
            }
        }
        if (queue.isEmpty())
            return "/";
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        while (!queue.isEmpty()){
            sb.append(queue.poll());
            sb.append("/");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
