class Solution {
    public int numSub(String s) {
        long x=1000000007;
        long c=0;
        long res=0;
        for(char i:s.toCharArray())
        {
            if(i=='1'){
                c++;
                res+=c;
                res%=x;
            }
            else{
                c=0;
            }
        }
        return (int)res;
    }
}