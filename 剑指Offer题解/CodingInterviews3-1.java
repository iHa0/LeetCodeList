class Solution {
    public boolean isUnique(String astr) {
        if(astr == null){
            return false;
        }
      Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i< astr.length();i++){
            if(map.containsKey(astr.charAt(i))){
                return false;
            }
            map.put(astr.charAt(i),i);
        }
        return true;
    }
}
