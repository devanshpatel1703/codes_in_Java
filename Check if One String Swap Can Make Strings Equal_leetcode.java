class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0,in1=0,in2=0;
        int temp1=0,temp2=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
            if(count==1 && temp1==0){
                in1=i;
                temp1=1;
            }
            if(count==2 && temp2==0){
                in2=i;
                temp2=1;
            }
            if(count>2){
                return false;
            }
        }
        if(count==0){
            return (true);
        }
        if(count==2){
            if((s1.charAt(in1)==s2.charAt(in2)) && (s1.charAt(in2)==s2.charAt(in1))){
                return (true);
            }
            else{
                return (false);
            }
        }
        return false;
    }
}
