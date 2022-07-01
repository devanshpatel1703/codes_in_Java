import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the string :");
        String str=input.nextLine();
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='1'&&str.charAt(i)<='9'){
                sum=sum+('0'-str.charAt(i));
            }
            else
            {
                continue;
            }
        }
        System.out.printf("The sum of numbers is :%d",sum*(-1));
    }
}
