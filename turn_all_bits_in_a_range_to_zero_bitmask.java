import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        int a=31;
        int mask=1;
        int count=0;
        int or=0;
        int start=1;
        int end=3;
        for(int i=0;i<32;i++){
            if(i>=start && i<=end){
                mask<<=1;
            }
            else{
                if((a&mask)>0){
                    or=or|mask;
                }
                mask<<=1;
            }
        }
        System.out.printf("%d",or);
	}
}
