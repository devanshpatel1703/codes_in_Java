import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the String to reverse it :");
        String s=input.next();
        System.out.printf("The reverse is :%s",fun(s,s.length()-1));
    }
    public static String fun(String str,int n){
        if(n==-1){
            return ("");
        }
        return str.charAt(n)+fun(str,n-1);
    }
}
