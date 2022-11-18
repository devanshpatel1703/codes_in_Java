import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the size of array :");
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        int ans=0;
        int ele=a[0];
        int count=1;
        for(int i=0;i<a.length-1;i++){
            if(count>ans){
                ans=count;
                ele=a[i];
            }
            if(a[i]==a[i+1]){
                count++;
            }
            else{
                count=1;
            }
        }
        System.out.printf("Largest count=%d\nElement :%d",ans,ele);
    }
}
