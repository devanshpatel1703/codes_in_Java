import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the number :");
        int n=input.nextInt();
        int temp=n;
        int count=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        int new_n=n;
        int[] a=new int[count];
        int in=count-1;
        while(n!=0){
            a[in--]=n%10;
            n/=10;
        }
        int[] ans=new int[count];
        for(int i=0;i<ans.length;i++){
            ans[(ans.length)-a[i]]=ans.length-i;
        }
        long answer=0;
        for(int i=0;i<ans.length;i++){
            answer=answer*10+ans[i];
        }
        System.out.printf("%d",answer);
    }
}
