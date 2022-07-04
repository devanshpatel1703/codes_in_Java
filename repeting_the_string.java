import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.printf("Enter a sting :"); 
        Scanner input = new Scanner (System.in);
        String str=input.next();
        System.out.printf("Enter the number of repetetions :");
        int n=input.nextInt();
        n--;
        String ans="";
        while(n>-1){
            for(int i=0;i<=n;i++){
                ans=ans+str.charAt(i);
            }
            n--;
        }
        System.out.printf("The reultant string is :%s",ans);
    }
}
