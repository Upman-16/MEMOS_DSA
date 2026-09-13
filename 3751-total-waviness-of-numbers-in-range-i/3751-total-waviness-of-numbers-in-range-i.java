class Solution {
    private int ans(int n){
        int count=0;
        while(n>100){
            int a=n%10;
            n/=10;
            int b=n%10;
            n/=10;
            int c=n%10;
            if((b<a && b<c) || (b>a && b>c)) count++;
            n=n*10+b;
        }
        return count;
    }
    public int totalWaviness(int num1, int num2) {
        int answer=0;
        for(int i=num1;i<=num2;i++){
            answer+=ans(i);
        }
        return answer;
    }
}