/*method are predefined methods and user defined as per specific program 
the predefined methods are inthe packages like length method arrays and string method like append ,insert,upper case etc;
method are setter and getters means setter is
Getters and Setters in Java are methods used to access (get) and update (set) the private variables of a class.
'''  // Setter method → sets value
    public void setName(String name) {
        this.name = name;
    }
'''
'''
// Getter method → gets value
    public String getName() {
        return name;
    }
 '''
method can be void  final staic and synchronized also it mainly used for performe some operation on the data and return the result.*/

public class methods{
    String student_name;
    int sid;
    void show(){
        System.out.println("Student Name: "+student_name);
    }
    void acceptinfo(String student_name,int sid){
        
        this.student_name=student_name;//this refers to current value
        this.sid=sid;
        
    }
    static void showinfo(String student_name,int sid){
        System.out.println("Student Name: "+student_name);
    }
    
   public static void main(String [] args) {
    methods m = new methods();//obj creation
    m.acceptinfo("Rahul", 101);//method with returning value parameters
    m.show();//method using ref
    methods.showinfo("king",102);//static


}
}