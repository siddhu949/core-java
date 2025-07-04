/* variables are used to hold the values of the dat type and these are the three types local static and instance variables 
if we use the final thst the value of the variable no change throught the program.
this key wird is used to ref the current the object of the class*/
/* class is the blueprint of the object which we have to run or perfome the code class are the main part of the oops concept*/
/*object is the instance of the class where we can ref the class and class the methods in it object is created by using the new keyword in java*/
/*constructor is the special method of the class which is used to initialize the object of the class it*/
/*constructors are the types are the default constructoe, parameterized constructor and chaining constructor where we using this keyword to initalize the variables of another constructor*/
public class variables{
    static int i = 20;
    void method(int i){
        System.out.println("local variable");
        System.out.println("Inside method: " + i);
    }
    int j =20;
    public static void main(String[] args) {
        System.out.println("the variable is static which is called with out any obj reference : firstly the static is printed after that the main block is printed");
        System.out.println(i);
        variables v = new variables();
        v.method(10);//the pariameter is passed as 10
        System.out.println("printing the instance variable"+v.j);
    }

}