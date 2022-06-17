import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the string you want to check :");
        String str=input.nextLine();
        System.out.printf("Enter the string to end with :");
        String str1=input.nextLine();
        if(str.endsWith(str1)){
            System.out.printf("Yes.");
        }
        else{
            System.out.printf("No.");
        }
    }
}
