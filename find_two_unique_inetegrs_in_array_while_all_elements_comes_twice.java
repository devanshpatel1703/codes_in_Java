public class Program{
    public static void main(String[] args) {
		int[] a={1,1,2,2,3,3,4,20,7,7};
        int xor=0;
        for(int i : a){
            xor^=i;
        }
        int n1=0,n2=0;
        int one=1;
        while((one&xor)==0){
            one=one<<1;
        }
        for(int i : a){
            if((i&one)!=0){
                n1^=i;
            }
            else{
                n2^=i;
            }
        }
        System.out.printf("%d %d",n1,n2);
	}
}
