import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("red");
        list.add("orange");
        list.add("blue");
        list.add("green");
        list.add("yellow");
        for(String a:list){
            System.out.printf("%s\n",a);
        }
        System.out.printf("The new array list is :\n");
        list.add(0,"black");
        for(String a:list){
            System.out.printf("%s\n",a);
        }
        System.out.printf("Index of each colour in arraylist :\n");
        for(int i=0;i<list.size();i++){
            System.out.printf("%s -> %d\n",list.get(i),i);
        }
	  list.set(0,"black");
	  System.out.printf("List after updating 0th index :\n");
        for(String a:list){
            System.out.printf("%s\n",a);
        }
	  System.out.printf("The new array list after removing 0th index is :\n");
	  list.remove(0);
        for(int i=0;i<list.size();i++){
            System.out.printf("%s\n",list.get(i));
        }
	  if (list.contains("green")) {
            System.out.println("\nFound the element");
        } 
        else
        {
        System.out.println("\nThere is no such element");
        }

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
