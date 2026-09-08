class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        HashSet<Character> set = new HashSet<>();
        int max=0;
        for(int r=0;r<s.length();r++){
            char chr=s.charAt(r);
            while(set.contains(chr)){
                char chl=s.charAt(l);
                set.remove(chl);
                l++;
            }
            set.add(chr);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}