class Solution {
    public int totalMoney(int n) {
        int w=n/7;
        int d=n%7;
        int s=0;
        for(int i=0;i<w;i++){
            s=s+28+i*7;
        }
        int s1=0;
        for(int i=0;i<d;i++){
            s1=s1+w+1+i;
        }
        return s+s1;
    }
}