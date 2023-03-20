public class Program{
    public static void main(String[] args) {
        int n=10;
		count(n);
	}
    public static void count(int n){
        if(n==-1){
            return;
        }
        System.out.printf("%d ",n);
        count(n-1);
    }
}
