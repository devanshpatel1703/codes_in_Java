import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        List<String> list_num=new ArrayList<String>();
        for(int i=5;i>=1;i--){
            String a=Integer.toString(i);
            list_num.add(a);
        }
        System.out.printf("Original arraylist :\n");
        for(int i=0;i<list_num.size();i++){
            System.out.printf("%s\n",list_num.get(i));
        }
        System.out.printf("After sorting the arraylist :\n");
        Collections.sort(list_num);
        for(int i=0;i<list_num.size();i++){
            System.out.printf("%s\n",list_num.get(i));
        }
    }
}
