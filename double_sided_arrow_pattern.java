import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        
        int n=input.nextInt();
        
        int r=n/2;
        for(int i=1;i<=r+1;i++){
            //starting space
            for(int s=1;s<=(r+1)*(r-i+1);s++){
                System.out.printf(" ");
            }
            //starting numbers
            for(int j=i;j>=1;j--){
                System.out.printf("%d ",j);
            }
            //middle spaces
            for(int ms=((r+1)*(i-1))-2;ms>=1;ms--){
                System.out.printf(" ");
            }
            //end numbers
            if(i==1){
                System.out.printf("\n");
                continue;
            }
            for(int en=1;en<=i;en++){
                System.out.printf("%d ",en);
            }
            System.out.printf("\n");
        }
        
        
        for(int i=r;i>=1;i--){
            //starting space
            for(int s=1;s<=(r+1)*(r-i+1);s++){
                System.out.printf(" ");
            }
            //starting numbers
            for(int j=i;j>=1;j--){
                System.out.printf("%d ",j);
            }
            //middle spaces
            for(int ms=((r+1)*(i-1))-2;ms>=1;ms--){
                System.out.printf(" ");
            }
            //end numbers
            if(i==1){
                System.out.printf("\n");
                continue;
            }
            for(int en=1;en<=i;en++){
                System.out.printf("%d ",en);
            }
            System.out.printf("\n");
        }
	}
}
