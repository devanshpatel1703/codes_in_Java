import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.printf("Enter a string :");
        String str=input.nextLine();
        System.out.printf("Enter the character which left right and it you want to delete :");
        String c=input.next();
        int n=str.indexOf(c);
        String ans="";
        for(int i=0;i<str.length();i++){
            if(i==n-1||i==n||i==n+1){
                continue;
            }
            else{
                ans+=str.charAt(i);
            }
        }
        System.out.printf("The result is :%s",ans);
    }
}
