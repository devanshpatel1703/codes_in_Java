import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int j,k;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(j=1;j<=n;j++){
                int temp=1,term=0,val=0;
                for(k=1;k<=j;k++){
                    val=val+temp;
                    temp*=2;
                }
                val=val*b;
                term=val+a;
                System.out.printf("%d ",term);
            }
            System.out.printf("\n");
        }
        in.close();
    }
}
