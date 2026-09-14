class Solution {
    public int compress(char[] chars) {
       StringBuilder s=new StringBuilder();
       int i=0;
       while(i<chars.length){
        int count=0;
        char ch=chars[i];
       // s.append(ch);
        while(i<chars.length && chars[i]==ch){
            count++;
            i++;
        }
        s.append(ch);
        if(count>1) s.append(count);
       }
       for(int j=0;j<s.length();j++){
        chars[j]=s.charAt(j);
       }
       return s.length();
}
}