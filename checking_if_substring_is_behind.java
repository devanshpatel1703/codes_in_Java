import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the string :");
        String str=input.nextLine();
        System.out.printf("Enter the substring you want to check :");
        String str1=input.nextLine();
        System.out.printf("Enter the character point :");
        String check=input.next();
        if((str.indexOf(check))>(str.indexOf(str1)+str1.length()-1)){
           System.out.printf("Yes it is behind."); 
        }
        else{
            System.out.printf("No it's not behind.");
        }
    }
}
