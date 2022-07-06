import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the string :");
        String str=input.nextLine();
        System.out.printf("Enter the substring you want to check :");
        String check=input.nextLine();
        if((str.indexOf(check)+check.length())==(str.length())){
            System.out.printf("Yes %s is ends with %s.",str,check);
        }
        else{
            System.out.printf("No %s does not ends with %s.",str,check);
        }
    }
}
