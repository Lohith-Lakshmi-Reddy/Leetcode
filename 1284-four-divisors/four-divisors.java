class Solution {
    public int sumFourDivisors(int[] nums) {
        int x=0;
        for(int n:nums){
            int sum=0,c=0;
            for(int i=1;i*i<=n;i++){
                if(n%i==0){
                    c++;
                    sum+=i;
                    if(i!=n/i){
                        c++;
                        sum+=n/i;
                    }
                }
                if(c>4){
                    break;
                }
            }
            if(c==4){
                x+=sum;
            }
        }
        return x;
    }
}