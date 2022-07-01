import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the string :");
        String str=input.nextLine();
        System.out.printf("Enter number of times you want to concatinate it with itself :");
        int n=input.nextInt();
        String ans="";
        for(int i=1;i<=n;i++){
            ans=ans+str;
        }
        System.out.printf("The resultant string is :%s",ans);
    }
}
