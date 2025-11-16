class Solution {
    public boolean checkStraightLine(int[][] c) {
        int p1=c[0][0],q1=c[0][1];
        int p2=c[1][0],q2=c[1][1];
        for(int i=2;i<c.length;i++){
            int p=c[i][0],q=c[i][1];
            if((q2-q1)*(p-p2)!=(q-q2)*(p2-p1)){
                return false;
            }
        }
        return true;
    }
}