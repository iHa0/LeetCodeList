/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(knows(ans, i)){
                ans = i;
            }
        }
        for(int i = 0; i < n; i++){
            if(i != ans){
                if(!knows(i, ans)){
                    return -1;
                }
                if(knows(ans, i)){
                    return -1;
                }
            }
        }
        return ans;
    }
}
