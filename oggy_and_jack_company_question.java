import java.util.*;
class LCMCalculator {
    
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int lcmOfArray(int[] numbers) {
        int lcmResult = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcmResult = lcm(lcmResult, numbers[i]);
        }
        return lcmResult;
    }

    public static void main(String[] args) {
        long m=1000000007;
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        ArrayList<Long> list=new ArrayList<>();
        while(t!=0){
            int b=input.nextInt();
            int[] arr = new int[b];
            for(int i=0;i<arr.length;i++){
                arr[i]=b--;
            }
            list.add(lcmOfArray(arr)%m);
            t--;
        }
        for(long i : list){
            System.out.printf("%d\n",i);
        }
    }
}
