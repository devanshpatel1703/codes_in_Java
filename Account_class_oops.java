import java.util.Scanner;
class Account{
    int balance;
    private String id,name;
    public Account(String i,String n,int b){
        balance=b;
        id=i;
        name=n;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int b1,int b2){
        if(b1<b2){
            System.out.printf("Not sufficent balance sorry.\n");
            return 0;
        }
        else{
            balance=b1-b2;
            return (b2+b1);
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter your (sender) costomer ID :");
        String sender_id=input.next();
        System.out.printf("Enter the (sender) costomer name :");
        String sender_name=input.next();
        System.out.printf("Enter your (sender) balance :");
        int sender_balance=input.nextInt();
        System.out.printf("Enter your (reciver) costomer ID :");
        String recever_id=input.next();
        System.out.printf("Enter the (reciver) costomer name :");
        String recever_name=input.next();
        System.out.printf("Enter your (reciver) balance :");
        int recever_balance=input.nextInt();
        Account sender=new Account(sender_id,sender_name,sender_balance);
        Account recever=new Account(recever_id,recever_name,recever_balance);
        recever.balance=sender.credit(sender.balance,recever.balance);
        System.out.printf("Transfering money........\nYour money is succesfully transfered.\nFrom:\n");
        System.out.printf("ID :%s\nName :%s\nTo:\nID :%s\nName :%s\nYour current balance is :%d",sender.getId(),sender.getName(),recever.getId(),recever.getName(),recever.getBalance());
    }
}
