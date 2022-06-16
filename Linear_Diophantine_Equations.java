import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,i,sol_y=0,sol_x=0;
        System.out.print("Enter a :");
        a=input.nextInt();
        System.out.print("Enter b :");
        b=input.nextInt();
        System.out.print("Enter c :");
        c=input.nextInt();
        System.out.print("Your entred equation is : ");
        System.out.print(a+"x + "+b+"y "+" = "+c+"\n");
        for(i=1;i<=c;i++){
            if((c-a*i)/b==1){
                sol_y=i;
                break;
            }
        }
        for(i=1;i<=c;i++){
            if((c-b*i)/a==1){
                sol_x=i;
                break;
            }
        }
        if(sol_x==0&&sol_y==0){
            System.out.println("No possible solution.");
        }
        System.out.println("\nThe value of x : "+sol_x);
        System.out.println("\nThe value of y : "+sol_y);
    }
}
