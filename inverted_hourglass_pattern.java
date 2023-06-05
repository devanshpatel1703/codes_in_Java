import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

        int n=input.nextInt();
        int s=(n-1)*2;
        int s2=s;
        for(int r=1;r<=n;r++){
            //first numbers
            int p=n;
            for(int fn=1;fn<=r;fn++){
                System.out.printf("%d ",p--);
            }
            //middle space
            for(int ms=1;ms<=(s*2)+2;ms++){
                System.out.printf(" ");
            }
            s=s-2;
            p++;
            //end numbers
            int q=p;
            for(int en=q;en<=n;en++){
                System.out.printf("%d ",en);
            }
            System.out.printf("\n");
        }
        for(int i=n;i>=0;i--){
            System.out.printf("%d ",i);
        }
        for(int i=1;i<=n;i++){
            System.out.printf("%d ",i);
        }
        
        
        System.out.printf("\n");
        
        s=0;
        for(int r=n;r>=1;r--){
            //first numbers
            int p=n;
            for(int fn=1;fn<=r;fn++){
                System.out.printf("%d ",p--);
            }
            //middle space
            for(int ms=1;ms<=(s*2)+2;ms++){
                System.out.printf(" ");
            }
            s=s+2;
            p++;
            //end numbers
            int q=p;
            for(int en=q;en<=n;en++){
                System.out.printf("%d ",en);
            }
            System.out.printf("\n");
        }
	}
}
