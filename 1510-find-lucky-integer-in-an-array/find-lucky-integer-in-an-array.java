class Solution {
    public int findLucky(int[] arr) {
        int[] c=new int[1000];
        for(int i:arr){
            if(i>=0&&i<c.length){
                c[i]++;
            }
        }
        int x=-1;
        for(int j=1;j<c.length;j++){
            if(c[j]==j){
                x=j;
            }
        }
        return x;
    }
}