    public int findComplement(int n) {
        String str=Integer.toBinaryString(n);
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                ans=ans+'0';
            }
            else{
                ans=ans+'1';
            }
        }
        int decimal=Integer.parseInt(ans,2);
        return (decimal);
    }
}
