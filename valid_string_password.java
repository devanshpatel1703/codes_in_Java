import java.util.Scanner;
class HelloWorld {
    public static int character(String str){
        int length=str.length();
        if(length>=10){
            return 1;
        }
        return 0;
    }
    public static int letterDigits(String str){
        int i;
        char c;
        for(i=0;i<str.length();i++){
            c=str.charAt(i);
            if((c>='0'&&c<='9')||(c>='a'&&c<='z')){
                continue;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
    public static int checkDigit(String str){
        int i;
        int count=0;
        for(i=0;i<str.length();i++){
            if(count==2){
                return 1;
            }
            if(str.charAt(i)>='0'&&str.charAt(i)>='9'){
                count++;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.print("Enter the password :");
        Scanner input=new Scanner(System.in);
        String str=input.next();
        int check1=character(str);
        int check2=letterDigits(str);
        int check3=checkDigit(str);
        if(check1==1&&check2==1&&check3==1){
            System.out.printf("Its a valid password.");
        }
        else{
            System.out.printf("Not a valid password.");
        }
    }
}
