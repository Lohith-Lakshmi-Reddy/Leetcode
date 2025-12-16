class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] c=new int[100];
        for(char ch:text.toCharArray()){
            c[ch-'a']++;
        }
        int min=Integer.MAX_VALUE;
        min=Math.min(min,c['b'-'a']);
        min=Math.min(min,c['a'-'a']);
        min=Math.min(min,c['l'-'a']/2);
        min=Math.min(min,c['o'-'a']/2);
        min=Math.min(min,c['n'-'a']);
        return min;
    }
}