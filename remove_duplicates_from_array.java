;import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] a={1,1,2,2,3,3,3,3,3,4,4,5,5,6,6,6,6};
        Arrays.sort(a);
        int idx=0;
        boolean b=false;
        for(int i=0;i<a.length-1;){
            int j=i+1;
            if(j==a.length-1){
                break;
            }
            while(a[j]==a[i]){
                j++;
                if(j==a.length-1){
                    b=true;
                    break;
                }
            }
            a[idx++]=a[i];
            i=j;
            if(b==true){
                break;
            }
        }
        for(int i=idx;i<a.length;i++){
            a[i]=0;
        }
        for(int i : a){
            System.out.printf("%d ",i);
        }
	}
}
