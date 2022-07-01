import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the string :");
        String str=input.nextLine();
        System.out.printf("Enter the character which you want to remove :");
        String ch=input.next();
        str=str.replace(ch,"");
        System.out.printf("The resultant string is :%s",str);
    }
}
