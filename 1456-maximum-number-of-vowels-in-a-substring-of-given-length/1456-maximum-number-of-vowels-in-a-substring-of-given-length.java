class Solution {
    public int maxVowels(String s, int k) {
        char str[]=s.toCharArray();
        int left=0;
        int count=0;
        int ans=-1;
        char ss=0;
        for(int i=0;i<str.length;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            count++;
           }
           if(i-left+1==k){
            ans=Math.max(ans,count);
            if(s.charAt(left)=='a'||s.charAt(left)=='e'||s.charAt(left)=='i'||s.charAt(left)=='o'||s.charAt(left)=='u'){
                count--;
            }
            left++;
            }
           
        }
        return ans;
    }
}