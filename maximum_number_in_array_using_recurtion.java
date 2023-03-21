public class Main{
	public static void main(String[] args) {
	    int[] a={2,3,4,5,6,1};
	    System.out.printf("Minimum number in array :%d",maximum(a,0));;
	}
	public static int maximum(int[] a,int i){
	    if(i==a.length){
	        return Integer.MIN_VALUE;
	    }
	    return Math.max(a[i],maximum(a,i+1));
	}
}
