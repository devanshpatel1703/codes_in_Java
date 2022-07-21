import java.util.Scanner;
class Return{
    Scanner input=new Scanner (System.in);
    String[] returnStr(){
        int i=0;
        String arr[]=new String[5];
        for(i=0;i<5;i++){
            System.out.printf("Enter %d element :",i);
            arr[i]=input.next();
        }
        return (arr);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Return obj=new Return();
        String[] a=obj.returnStr();
        for(String name:a){
            System.out.printf("%s\n",name);
        }
    }
}
