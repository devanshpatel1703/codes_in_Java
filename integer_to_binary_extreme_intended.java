public class Program
{
    public static void main(String[] args) {
		int b=1111;
        int s=0;
        int two=0;
        while(b>0){
            if(two==0){
                if(b%10==1){
                    s=1;
                    two=1;
                }
                else{
                    two=1;
                }
            }
            if(b%10==1){
                s=s+two;
            }
            two*=2;
            b/=10;
        }
        System.out.printf("%d",s);
	}
}
