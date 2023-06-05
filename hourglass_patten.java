import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

        int n=input.nextInt();
        int s=1;
        for(int r=1;r<=n;r++){
            //start space
            if(r>1){
                for(int ss=1;ss<=s+1;ss++){
                   System.out.printf(" ");
                }
                s=s+2;
            }
            //numbers
            for(int n1=n-r+1;n1>=0;n1--){
                System.out.printf("%d ",n1);
            }
            //numbers
            for(int n2=1;n2<=n-r+1;n2++){
                System.out.printf("%d ",n2);
            }
            System.out.printf("\n");
        }
        //middle line
        for(int i=1;i<=s+1;i++){
            System.out.printf(" ");
        }
        System.out.printf("%d\n",0);
        
        
        
        
        //end
        s--;
        for(int r=n;r>=1;r--){
            //start space
            if(r>1){
                for(int ss=1;ss<=s;ss++){
                   System.out.printf(" ");
                }
                s=s-2;
            }
            //numbers
            for(int n1=n-r+1;n1>=0;n1--){
                System.out.printf("%d ",n1);
            }
            //numbers
            for(int n2=1;n2<=n-r+1;n2++){
                System.out.printf("%d ",n2);
            }
            System.out.printf("\n");
        }
        
	}
}
