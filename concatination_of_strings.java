import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str1,str2;
        System.out.print("Enter 1st String : ");
        str1=input.nextLine();
        System.out.print("Enter 2nd String : ");
        str2=input.nextLine();
        String str3;
        str3=str1+str2;
        System.out.printf("Result : %s",str3);
    }
}
