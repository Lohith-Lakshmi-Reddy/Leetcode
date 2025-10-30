class Solution {
    public int minNumberOperations(int[] t) {
        int runs = t[0];
        for(int i=1;i<t.length;i++){
            if(t[i]>t[i-1]){
                runs+= t[i]-t[i-1];
            }
        }
        return runs;
    }
}