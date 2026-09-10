class Solution {
    public int countGoodSubstrings(String s) {
        int l=0;
        int count=0;
        for(int r=0;r<s.length();r++){
            if(r-l+1==3){
                char a=s.charAt(l);
                char b=s.charAt(l+1);
                char c=s.charAt(l+2);
                if(a!=b && b!=c && a!=c){
                    count++;
                }
                l++;
            }
        }
        return count;
    }
}