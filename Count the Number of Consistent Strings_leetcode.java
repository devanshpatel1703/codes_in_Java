class Solution {
    public int countConsistentStrings(String str, String[] w) {
        int count=0;
        for(int i=0;i<w.length;i++){
            int temp=1;
            String check=w[i];
            for(int j=0;j<check.length();j++){
                if(str.indexOf(check.charAt(j))==-1){
                    temp=0;
                    break;
                }
            }
            if(temp==1){
                count++;
            }
        }
        return count;
    }
}
