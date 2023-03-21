public class Main{
	public static void main(String[] args) {
	    int[] a={2,3,4,5,6,1};
	    System.out.printf("%d",minimum(a,0));;
	}
	public static int minimum(int[] a,int i){
	    if(i==a.length){
	        return Integer.MAX_VALUE;
	    }
	    return Math.min(a[i],minimum(a,i+1));
	}
}
