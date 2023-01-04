import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the size of array :");
        int n=input.nextInt();
        int[] a=new int[n];
        System.out.printf("Enter the array in sorted order :");
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.printf("Enter the number you want to find :");
        int num=input.nextInt();
        int count=0;
        int left=0;
        int right=n;
        int mid=0;
        int temp=-1;
        while(temp!=num){
            count++;
            mid=(left+right)/2;
            if(a[mid]==num){
                temp=num;
                System.out.printf("Found a index :%d\n",mid);
                System.out.printf("Number of itrations :%d\n",count);
                break;
            }
            else if(a[mid]>num){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
    }
}
