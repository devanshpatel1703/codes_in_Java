import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter primary string :");
        String str=input.nextLine();
        System.out.printf("Enter Secondary string :");
        String check=input.nextLine();
        int temp=str.lastIndexOf(check);
        if(temp>0){
            System.out.printf("Yes, %s present in %s at last index =%d.",str,check,temp);
        }
        else{
            System.out.printf("No, %s is not present in %s.",str,check);
        }
    }
}
