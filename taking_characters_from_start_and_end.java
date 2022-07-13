import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.printf("Enter a string :");
        String str=input.nextLine();
        System.out.printf("Enter the character you want from starting and last :");
        int n=input.nextInt();
        String ans="";
        for(int i=0;i<n;i++){
            ans+=str.charAt(i);
            
        }
        int temp=str.length();
        temp=temp-n;
        for(int i=temp;i<str.length();i++){
            ans=ans+str.charAt(i);
        }
        System.out.printf("The result is :%s",ans);
    }
}
