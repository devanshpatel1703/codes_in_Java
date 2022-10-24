import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        List<Integer> list_num=new ArrayList<Integer>();
        for(int i=6;i>=1;i--){
            list_num.add(i);
        }
        System.out.printf("Original arraylist :\n");
        for(int i=0;i<list_num.size();i++){
            System.out.printf("%d ",list_num.get(i));
        }
        System.out.printf("After swapping elements at 1 and 4 index the result is :\n");
        int left=list_num.get(1);
        int right=list_num.get(4);
        list_num.set(1,right);
        list_num.set(4,left);
        for(int a:list_num){
            System.out.printf("%d ",a);
        }
    }
}
