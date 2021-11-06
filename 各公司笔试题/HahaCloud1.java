public class Hahayun {
    public int upper_bound_ (int n, int v, int[] a) {
        // write code here
        int left = 0, right = n - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(a[mid] > v){
                right = mid - 1;
            }else if(a[mid] < v){
                left = mid + 1;
            }else if(a[mid] == v){
                while(mid != 0 && a[mid] == a[mid - 1])
                    mid--;
                return mid + 1;
            }
        }
        return n + 1;
    }
}
