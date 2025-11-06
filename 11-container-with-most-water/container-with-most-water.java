class Solution {
    public int maxArea(int[] h) {
        int l=0;
        int r=h.length-1;
        int area=0;
        while(l<r){
            int x=Math.min(h[l],h[r]);
            int y=r-l;
            area=Math.max(area,x*y);

            if(h[l]<h[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return area;
    }
}