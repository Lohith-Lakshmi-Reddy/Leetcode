class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int t=0;
        for(int a:apple) t+=a;
        Arrays.sort(capacity);
        int s=0,c=0;
        for(int i=capacity.length-1;i>=0;i--){
            s+=capacity[i];
            c++;
            if(s>=t) break;
        }
        return c;
    }
}