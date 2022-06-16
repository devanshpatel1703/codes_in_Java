import java.util.Scanner;
class Main {
    public static void main(String[] args){
        int n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of array :");
    n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        System.out.print("Enter element :");
        a[i]=sc.nextInt();    
    }
    for(int element:a){
        System.out.println(element);
    }
    }
}
