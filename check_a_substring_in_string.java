import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str1,str2;
        System.out.print("Enter 1st String : ");
        str1=input.nextLine();
        System.out.print("Enter check  subString : ");
        str2=input.nextLine();
        int check=str1.indexOf(str2);
        if(check<1){
            System.out.printf("Not present.");
        }
        else{
            System.out.printf("Present.");
        }
    }
}
