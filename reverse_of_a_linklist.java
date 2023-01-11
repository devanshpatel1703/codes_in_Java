class linklist{
    static node head;
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void insert(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;   
        }
        else{
            node dummy=head;
            while(dummy.next!=null){
                dummy=dummy.next;
            }
            dummy.next=newnode;
        }
    }
    public static void display(){
        node dummy=head;
        while(dummy!=null){
            System.out.printf("%d -> ",dummy.data);
            dummy=dummy.next;
        }
        System.out.printf("null\n");
    }
    public static void main(String[] args){
        linklist lnklst=new linklist();
        lnklst.insert(1);
        lnklst.insert(2);
        lnklst.insert(3);
        lnklst.insert(4);
        lnklst.insert(5);
        lnklst.insert(6);
        lnklst.insert(7);
        lnklst.insert(8);
        lnklst.insert(9);
        lnklst.insert(10);
        node pichla=null;
        node curr=head;
        node agla=null;
        while(curr!=null){
            agla=curr.next;
            curr.next=pichla;
            pichla=curr;
            curr=agla;
        }
        head=pichla;
        lnklst.display();
    }
}
