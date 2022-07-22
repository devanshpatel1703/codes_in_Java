import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.printf("Enter double :"); 
        Scanner input=new Scanner(System.in);
        double a=input.nextDouble();
        String str=String.valueOf(a);
        String ans="";
        int temp=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='.'){
                temp=1;
            }
            if(temp==1){
                ans=ans+str.charAt(i);
            }
        }
        System.out.printf("The digits after decimal are :%s",ans);
    }
}
