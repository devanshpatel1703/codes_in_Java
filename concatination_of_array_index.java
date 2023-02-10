import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        System.out.printf("Enter the size of array :");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String[] a=new String[n];
        a[0]=Integer.toString(0);
        for(int i=1;i<a.length;i++){
            a[i]=a[i-1]+Integer.toString(i);
        }
        for(String s : a){
            System.out.printf("%s\n",s);
        }
    }
}
