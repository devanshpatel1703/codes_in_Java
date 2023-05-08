import java.util.*;
public class Program{
    public static void main(String[] args) {
        int[] a={37, 8, 49, 12, 31, 3, 45, 20, 26, 10, 18, 7, 16, 11, 28, 47, 6, 41, 27, 25, 29, 24, 39, 22, 42, 2, 19, 44, 50, 30, 5, 13, 14, 36, 35, 48, 9, 34, 4, 23, 46, 1, 40, 15, 38, 33, 21, 32, 17, 43};
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
	}
}
