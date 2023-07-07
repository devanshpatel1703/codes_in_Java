public class Program
{
    public static void main(String[] args) {
		System.out.printf("%d",jumpThree(10));
	}
    public static int jumpThree(int n){
        if(n==3){
            return 4;
        }
        if(n==2){
            return 2;
        }
        if(n==1){
            return 1;
        }
        return jumpThree(n-1)+jumpThree(n-2)+jumpThree(n-3);
    }
}
