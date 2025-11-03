class Solution {
    public int minCostClimbingStairs(int[] c) {
        int[] a=new int[c.length+1];
        a[0]=0;
        a[1]=0;
        for(int i=2;i<=c.length;i++){
            a[i]=Math.min(a[i-1]+c[i-1],a[i-2]+c[i-2]);
        }
        return a[c.length];
    }
}