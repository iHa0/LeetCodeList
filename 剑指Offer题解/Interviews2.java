class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        StringBuffer stringBuffer=new StringBuffer(s1);
            for(int i=0;i<s2.length();i++){
                if(!s1.contains(s2.charAt(i)+"")) return false;
                String s=new String(stringBuffer);
                if(s.contains(s2.charAt(i)+"")){
                    stringBuffer.deleteCharAt(stringBuffer.indexOf(s2.charAt(i)+""));
                }else {
                    return false;
                }
            }
            if(stringBuffer.length()==0) return true;
        return false;
    }
}
