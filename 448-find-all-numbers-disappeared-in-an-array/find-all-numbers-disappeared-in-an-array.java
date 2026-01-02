class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> r=new ArrayList<>();
        int n=nums.length;
        int x=1;
        for(int num:nums){
            while(x<num){
                r.add(x);
                x++;
            }
            if(x==num){
                x++;
            }
        }
        while(x<=n){
            r.add(x);
            x++;
        }
        return r;
    }
}