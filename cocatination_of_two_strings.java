import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Enter 1st string :");
        Scanner input=new Scanner(System.in);
        String str1=input.nextLine();
        System.out.printf("Enter 2nd string:");
        String str2=input.nextLine();
        String str3=str1+" "+str2;
        System.out.printf("Concatinated string :%s",str3);
        
    }
}
