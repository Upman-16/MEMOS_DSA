class Solution {
    public int minSteps(String s, String t) {
       int l=0;
       int p[]=new int[26];
       int w[]=new int[26];
       HashMap<Integer,Integer> map=new HashMap<>();
       int a=s.length();
       for(int i=0;i<a;i++){
        char chs=s.charAt(i);
        p[chs-'a']++;
        char cht=t.charAt(i);
        w[cht-'a']++;
       } 
       int sums=0;
       int sumt=0;
       int count=0;
       for(int i=0;i<26;i++){
        if(p[i]==w[i]){
            continue;
        }
        else{
            count=count+(Math.abs(p[i]-w[i]));
        }
       }
       return count/2;
    }
}