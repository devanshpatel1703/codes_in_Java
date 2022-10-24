import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        List<Integer> list_num=new ArrayList<Integer>();
        for(int i=6;i>=1;i--){
            list_num.add(i);
        }
        System.out.printf("Original arraylist :\n");
        int num=list_num.size();
        for(int i=0;i<num;i++){
            list_num.remove(0);
        }
        System.out.println(list_num.isEmpty());
        System.out.println(list_num);
    }
}
