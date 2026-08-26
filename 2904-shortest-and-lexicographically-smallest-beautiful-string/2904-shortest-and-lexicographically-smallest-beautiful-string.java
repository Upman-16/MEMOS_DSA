class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
       String ans="";
       int left=0;
       int ones=0;
       for(int right=0;right<s.length();right++){
        if(s.charAt(right)=='1'){
            ones++;
        }
        while(ones>k){
            if(s.charAt(left)=='1'){
                ones--;
            }
            left++;
        }
        while(ones==k && s.charAt(left)=='0'){
            left++;
        }
        if(ones==k){
            String c=s.substring(left,right+1);
            if(ans.isEmpty() || c.length()<ans.length()||(c.length()==ans.length()&&c.compareTo(ans)<0)){
                ans=c;
            }
        }
       }
       return ans; 
    }
}