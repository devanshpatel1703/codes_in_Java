import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the string to encrypt it using Caesar's Code :");
        String str=input.next();
        String res="";
        int temp=0,i=0,flag=0;
        str=str.toUpperCase();
        for(i=0;i<str.length();i++){
            flag=(int)(str.charAt(i));
            if(flag>=88){
                temp=90-(int)(str.charAt(i));
                temp=2-temp;
                res=res+(char)('A'+temp);
            }
            else{
                res=res+(char)(str.charAt(i)+3);
            }
        }
        System.out.printf("The encrypted string is :%s",res);
    }
}
