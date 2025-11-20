class Solution {
    public String getHint(String secret, String guess) {
        int b=0;

        int[] scount=new int[10];
        int[] gcount=new int[10];

        for(int i=0; i<secret.length(); i++){
            char s=secret.charAt(i);
            char g=guess.charAt(i);
            
            if(s==g){
                b++;
            }
            else{



                scount[s - '0']++;
                gcount[g - '0']++;
            }
        }
       int c=0;
       for(int j=0;j<10;j++){
          c+=Math.min(scount[j],gcount[j]);
     }

         
        return b +"A"+c+"B";
    }
}