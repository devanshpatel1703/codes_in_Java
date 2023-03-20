public class Program{
    public static void main(String[] args) {
		String str="123456789";
        str=rev(str,str.length()-1);
        System.out.printf("%s",str);
	}
    public static String rev(String str,int i){
        if(i==-1){
            return "";
        }
        return ""+str.charAt(i)+rev(str,i-1);
    }
}
