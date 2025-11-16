class Solution {
    public boolean isBoomerang(int[][] p) {
        int p1=p[0][0],q1=p[0][1];
        int p2=p[1][0],q2=p[1][1];
        int p3=p[2][0],q3=p[2][1];
        
        
        if((p1==p2&&q1==q2)||(p1==p3&&q1==q3)||(p2==p3&&q2==q3)){
            return false;
        }
        int line = p1*(q2-q3)+p2*(q3-q1)+p3*(q1-q2);
        return line!=0;
    }
}