public class Getter{
    int p_id;
    String p_name;
    int price;
    int getpid(int p_id){
        return this.p_id=p_id;
    }
    String getpname(String p_name){
        return this.p_name=p_name;
    }
    int getprice(int price){
        return this.price=price;
    }
    
    public int getP_id() {
        return p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public int getPrice() {
        return price;
    }

  
 public static void main(String[] args) {
     Getter getter = new Getter();
     getter.getpid(1);
     getter.getpname("vivo");
     getter.getprice(10000);
    System.out.println(getter.p_id+" "+getter.p_name+" "+getter.price);
 }   

  
}