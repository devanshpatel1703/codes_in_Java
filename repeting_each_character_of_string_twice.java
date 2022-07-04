import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.printf("Enter sting :"); 
        Scanner input = new Scanner (System.in);
        String str=input.nextLine();
        String ans="";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<=1;j++){
                ans=ans+str.charAt(i);
            }
        }
        System.out.printf("The resultant string is :%s",ans);
    }
}
