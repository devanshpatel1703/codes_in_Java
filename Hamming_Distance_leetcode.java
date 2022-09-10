class Solution {
    public int hammingDistance(int sx, int sy) {
        String strx=Integer.toBinaryString(sx);
        String stry=Integer.toBinaryString(sy);
        int len=0;
        int check=0;
        int count=0;
        if(strx.length()>stry.length()){
            check=1;
            len=strx.length()-stry.length();
        }
        else if(strx.length()==stry.length()){
            check=0;
        }
        else{
            check=-1;
            len=stry.length()-strx.length();
        }
        if(check==1){
            String newY="";
            for(int i=0;i<len;i++){
                newY=newY+'0';
            }
            for(int i=0;i<stry.length();i++){
                newY=newY+stry.charAt(i);
            }
            for(int i=0;i<newY.length();i++){
                if(strx.charAt(i)!=newY.charAt(i)){
                    count++;
                }
            }
            
        }
        else if(check==-1){
            String newX="";
            for(int i=0;i<len;i++){
                newX=newX+'0';
            }
            for(int i=0;i<strx.length();i++){
                newX=newX+strx.charAt(i);
            }
            for(int i=0;i<newX.length();i++){
                if(stry.charAt(i)!=newX.charAt(i)){
                    count++;
                }
            }
        }
        else{
            for(int i=0;i<strx.length();i++){
                if(strx.charAt(i)!=stry.charAt(i)){
                    count++;
                }
            }
        }
        return (count);
    }
}
