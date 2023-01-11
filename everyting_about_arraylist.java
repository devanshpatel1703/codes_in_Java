import java.util.*;
class Main{
    public static void main(String[] args) {
        ArrayList<Integer> lst=new ArrayList<Integer>();
        lst.add(1);
        lst.add(2); 
        lst.add(3);
        for(int i : lst){
            System.out.printf("%d ",i);
        }
        System.out.printf("\n");
        lst.add(2,5);
        for(int i : lst){
            System.out.printf("%d ",i);
        }
        System.out.printf("\n");
        System.out.printf("%d\n",lst.get(2));
        lst.remove(2);
        for(int i : lst){
            System.out.printf("%d ",i);
        }
        System.out.printf("\n%d\n",lst.size());
    }
}
