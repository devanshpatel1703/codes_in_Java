import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.printf("Enter a string with here word two times :");
        String str=input.nextLine();
        String here="here";
        int start,end;
        start=str.indexOf(here);
        end=str.lastIndexOf(here);
        start+=4;
        String ans="";
        for(int i=start;i<end;i++){
            ans=ans+str.charAt(i);
        }
        System.out.printf("The result is :%s",ans);
    }
}
