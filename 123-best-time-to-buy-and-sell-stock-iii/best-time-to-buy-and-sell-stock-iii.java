class Solution {
    public int maxProfit(int[] pr) {
        int b1=Integer.MIN_VALUE;
        int b2=Integer.MIN_VALUE;
        int s1=0;
        int s2=0;
        for(int p:pr){
            b1=Math.max(b1,-p);
            s1=Math.max(s1,b1+p);
            b2=Math.max(b2,s1-p);
            s2=Math.max(s2,b2+p);
        }
        return s2;
    }
}