class Solution {
    public int[] minOperations(String boxes) {
        int b=boxes.length();
        int box[]=new int[b];
        for(int i=0;i<b;i++){
            box[i]=boxes.charAt(i)-'0';
        }
        int res[]=new int[b];
        
        for(int i=0;i<b;i++){
            int total=0;
            for(int j=0;j<b;j++){
                if(box[j]==1){
                    total+=Math.abs(i-j);
                }
                res[i]=total;
            }
        }
        return res;
    }
}