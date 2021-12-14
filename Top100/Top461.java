package Top100;

public class Top461 {
    public int hammingDistance(int x, int y) {
        String x2Form = Integer.toString(x, 2);
        String y2Form = Integer.toString(y, 2);
        int res = 0;
        int xLen = x2Form.length(), yLen = y2Form.length();
        int len = Math.max(xLen, yLen);
        while (yLen > 0 || xLen > 0){
            if (xLen - 1 >= 0 && yLen - 1 >= 0){
                if (x2Form.charAt(xLen - 1) != y2Form.charAt(yLen - 1))
                    res++;
                xLen--;
                yLen--;
            }
            if (xLen == 0 && yLen > 0){
                if (y2Form.charAt(yLen - 1) == '1'){
                    res++;
                }
                yLen--;
            }
            if (yLen == 0 && xLen > 0){
                if (x2Form.charAt(xLen - 1) == '1'){
                    res++;
                }
                xLen--;
            }
        }
        return res;
    }
}
