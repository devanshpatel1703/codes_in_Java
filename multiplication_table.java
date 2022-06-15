import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter N1 :");
        int n1=input.nextInt();
        for(int i=1;i<=10;i++){
            int m=n1*i;
            System.out.println(i+" Times "+n1+" is "+m);
        }
    }
}
