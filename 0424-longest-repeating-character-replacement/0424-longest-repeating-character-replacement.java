class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int freq[]=new int[26];
        int max=0;
        int hf=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            freq[ch-'A']++;
            hf=Math.max(hf,freq[ch-'A']);
            while(((r-l+1)-hf)>k){
                freq[s.charAt(l)-'A']--;
                l++;
                    //shrinking
            }
            max=Math.max(max,r-l+1);
            //processing
        }
        return max;
    }
}