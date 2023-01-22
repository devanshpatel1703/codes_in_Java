import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        System.out.printf("Enter the size of ArrayList :");
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        System.out.printf("Enter the ArrayList (In sorted form):");
        for(int i=0;i<N;i++){
            int a=input.nextInt();
            list.add(a);
        }
        int count=0;
        int left=0;
        int right=list.size();
        int n=0;
        boolean check=true;
        while(check!=false){
            if(list.size()==0){
                break;
            }
            int temp=-1;
            while(left<right){
                if(list.get((left+right)/2)==0){
                    temp=0;
                    count++;
                    list.remove((left+right)/2);
                    break;
                }
                else if(list.get((left+right)/2)>0){
                    right=(left+right)/2;
                }
                else{
                    left=(left+right)/2;
                }
            }
            if(temp==-1){
                check=false;
            }
        }    
        System.out.printf("Count of zeroes :%d",count);
    }
}
