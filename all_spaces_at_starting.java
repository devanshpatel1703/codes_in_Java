import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.printf("Enter a string with spaces anywhere :");
        Scanner input=new Scanner (System.in);
        String str=input.nextLine();
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                ans=ans+str.charAt(i);
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                ans=ans+str.charAt(i);
            }
        }
        System.out.printf("String after all spaces at the beginning is :%s",ans);
    }
}
