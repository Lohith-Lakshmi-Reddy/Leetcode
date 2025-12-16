class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int min=0;
        int max=0;
        int len=0;
        while(max<nums.length){
            while(nums[max]-nums[min]>1){
                min++;
            }
            if(nums[max]-nums[min]==1){
                len=Math.max(len,max-min+1);
            }
            max++;
        }
        return len;
    }
}