class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int l=0;
        int k=p.length();
        int po[]=new int[26];
        int w[]=new int[26];
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            po[ch-'a']++;
        }
        for(int r=0;r<s.length();r++){
            char ch_r=s.charAt(r);
            w[ch_r-'a']++;
            if(r-l+1==k){
                if(Arrays.equals(po,w)){
                    res.add(l);
                }
               char ch_l=s.charAt(l);
                w[ch_l-'a']--;
                l++;
            }
        }
        return res;
    }
}