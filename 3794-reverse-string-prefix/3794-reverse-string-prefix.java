class Solution {
    public String reversePrefix(String s, int k) {
        char str[]=s.toCharArray();
        for(int i=0,j=k-1;i<j;i++,j--){
            char t=str[i];
            str[i]=str[j];
            str[j]=t;
        }
        return new String(str);
    }
}