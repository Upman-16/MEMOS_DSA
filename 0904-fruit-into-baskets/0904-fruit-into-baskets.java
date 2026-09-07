class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int r=0;r<fruits.length;r++){
            int key=fruits[r];
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
            while(map.size()>2){
                int loki=fruits[l];
                 map.put(loki,map.get(loki)-1);
                if(map.get(loki)==0){
                    map.remove(loki);
                }
               
                l++;
            }
            //processing 
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}