import java.util.*;
public class Program{
    public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9};
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            int k=i;
            while(k<a.length){
                ArrayList<Integer> l=new ArrayList<>();
                for(int j=i;j<=k;j++){
                    l.add(a[j]);
                }
                k++;
                list.add(l);
            }
        } 
        System.out.println(list);
	}
}
