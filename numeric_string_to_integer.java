import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the string :");
        String str=input.nextLine();
        int n=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            n=n*10+(ch-'0');
        }
        System.out.printf("%s in Integer format is :%d",str,n);
    }
}
