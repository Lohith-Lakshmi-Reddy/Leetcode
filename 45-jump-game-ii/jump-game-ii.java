class Solution {
    public int jump(int[] nums) {
        int j=0;
        int cur=0;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,i+nums[i]);

            if(i==cur){
                j++;
                cur=max;
            }
        }
        return j;
    }
}