import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter primary string :");
        String str=input.nextLine();
        System.out.printf("Enter check string :");
        String check=input.nextLine();
        int index=str.indexOf(check);
        int len1=str.length();
        int len2=check.length();
        int temp=index+len2;
        if(temp==len1){
            System.out.printf("Yes, %s ends with %s.",str,check);
        }
        else{
            System.out.printf("No, %s do not ends with %s.",str,check);
        }
    }
}
