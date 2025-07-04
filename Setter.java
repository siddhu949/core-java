public class Setter{
    int pid;
    String pname;
    float pprice;
    int setpid(int pid){
        this.pid=pid;
        return pid;
        
    }
    String setpname(String pname){
        this.pname=pname;
        return pname;
}
float setpprice(float pprice){
    if(pprice<1000.00){
        System.out.println("the price is too low");
    }
    else{
        this.pprice=pprice;
        
    
}
return pprice;
}
public static void main(String[] args) {
     Setter setter1 = new Setter();
    Setter setter = new Setter();

    setter1.setpid(1);
    setter1.setpname("apple");
    setter1.setpprice(2000);
     setter.setpid(1);
    setter.setpname("apple");
    setter.setpprice(200);
}
}