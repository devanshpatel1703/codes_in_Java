import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.printf("Enter the size :");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the frequency :");
        int f=input.nextInt();
        System.out.printf("Enter the ARRAY :\n");
        for(int i=0;i<a.length;i++){
            a[i]=input.nextInt();
        }
        Arrays.sort(a);
        int ans=-1;
        int count=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                count++;
            }
            else{
                if(count!=f){
                    ans=a[i];
                    break;
                }
                count=1;
            }
        }
        if(ans==-1){
            System.out.printf("%d",a[n-1]);
        }
        else{
            System.out.printf("%d",ans);
        }
    }
}
