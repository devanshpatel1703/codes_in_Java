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
        for(int i=0;i<list_num.size()/2;i++){
            int left=list_num.get(i);
            int right=list_num.get(list_num.size()-1-i);
            list_num.set(list_num.size()-1-i,left);
            list_num.set(i,right);
        }
        System.out.printf("The arraylist after reversing :");
        for(int a:list_num){
            System.out.printf("%d ",a);
        }
    }
}
