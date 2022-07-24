class InvoiceItem{
    private int qty;
    private String id,desc;
    private double unitPrice;
    InvoiceItem(String i,String d,int q,double u){
        id=i;
        desc=d;
        qty=q;
        unitPrice=u;
    }
    public String getID(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public void setQty(int q){
        qty=q;
    }
    public int getQty(){
        return qty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double p){
        unitPrice=p;
    }
    public double getTotal(){
        return unitPrice*qty;
    }
    public String toString(){
        return "InvoiceItem[id="+id+",desc="+desc+",qty="+qty+",unitPrice="+unitPrice+"]";
    }
}
public class Main {
   public static void main(String[] args) {
      // Test constructor and toString()
      InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
      System.out.println(inv1);  // toString();

      // Test Setters and Getters
      inv1.setQty(999);
      inv1.setUnitPrice(0.99);
      System.out.println(inv1);  // toString();
      System.out.println("id is: " + inv1.getID());
      System.out.println("desc is: " + inv1.getDesc());
      System.out.println("qty is: " + inv1.getQty());
      System.out.println("unitPrice is: " + inv1.getUnitPrice());

      // Test getTotal()
      System.out.println("The total is: " + inv1.getTotal());
   }
}
