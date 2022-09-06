class Solution {
    public int numJewelsInStones(String jew, String s) {
        int count=0;
        for(int i=0;i<jew.length();i++){
            for(int j=0;j<s.length();j++){
                if(jew.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
        }
        return (count);
    }
}
