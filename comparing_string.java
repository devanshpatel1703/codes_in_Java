import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter primary string :");
        String str=input.nextLine();
        System.out.printf("Enter Secondary string :");
        String check=input.nextLine();
        boolean temp= str.equals(check);
        if(temp){
            System.out.printf("Yes, %s equales to %s.",str,check);
        }
        else{
            System.out.printf("No, %s is not equale to %s.",str,check);
        }
    }
}
