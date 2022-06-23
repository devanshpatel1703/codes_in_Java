import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter primary string :");
        String str=input.nextLine();
        System.out.printf("Enter check string :");
        String check=input.nextLine();
        int ans=str.indexOf(check);
        if(ans>0){
            System.out.printf("The index is :%d",ans);
        }
        else{
            System.out.printf("Not present.");
        }
    }
}
