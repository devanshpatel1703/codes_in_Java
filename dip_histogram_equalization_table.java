
import java.util.*;
public class Program{
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        System.out.printf("Enter the value of grey level :");
        int size=input.nextInt();
        int[] n=new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            n[i]=input.nextInt();
            sum+=n[i];
        } 
        System.out.println(Arrays.toString(n));
        double[] pdf=new double[size];
        for(int i=0;i<size;i++){
            pdf[i]=(n[i]*1.0)/sum;
        }
        System.out.println(Arrays.toString(pdf));
        double[] cdf=new double[size];
        cdf[0]=pdf[0];
        for(int i=1;i<size;i++){
            cdf[i]=cdf[i-1]+pdf[i];
        }
        System.out.println(Arrays.toString(cdf));
        double[] sk=new double[size];
        for(int i=0;i<size;i++){
            sk[i]=(size-1)*cdf[i];
        }
        System.out.println(Arrays.toString(sk));
        for(int i=0;i<size;i++){
            sk[i]=Math.round(sk[i]);
        }
        System.out.println(Arrays.toString(sk));
	}
}
