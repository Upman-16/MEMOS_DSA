class Solution {
    public String shiftingLetters(String s, int[] shifts) {
       char[] str= s.toCharArray();
       int sh=0;
       for(int i=shifts.length-1;i>=0;i--){
        sh=(sh+shifts[i])%26;
        str[i]=(char)('a'+(str[i]-'a'+sh)%26);
       }
    return new String(str);
    }
}