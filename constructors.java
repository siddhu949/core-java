public class constructors{
    String name;
    int age;
    constructors(){
        System.out.println("This is a default constructor");
        System.out.println("i am called automatically by compiler");
    }

    public constructors(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name+" "+age+" "+"by parameterized constructor");
    }
    
    public static void main(String[] args) {
        constructors c1=new constructors();
       constructors c2=new constructors("rahul",25);
    }


}