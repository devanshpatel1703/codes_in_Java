class Solution {
    public String decodeMessage(String key, String mes) {
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        char a='a';
        int count=0;
        for(int i=0;i<key.length();i++){
            if(count==27){
                break;
            }
            if(key.charAt(i)==' '){
                continue;
            }
            else if(!map.containsKey(key.charAt(i))){
                char k=(char)(a+count);
                map.put(key.charAt(i),k);
                count++;
            }
        }
        String ans="";
        for(int i=0;i<mes.length();i++){
            if(mes.charAt(i)==' '){
                ans=ans+' ';
            }
            else{
                char add=map.get(mes.charAt(i));
                ans=ans+add;
            }
        }
        return (ans);
    }
}
