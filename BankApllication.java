public class BankApllication{
 static int balance = 10000;
 int withdrawal(int wd){
   balance= balance-wd;
   System.out.println("the current balance"+" "+balance);
   return balance;
 }
 int deposit(int dp){//the int method should return any integer value if there is no void method
    balance = balance + dp;
    System.out.println("the current balance"+" "+balance);
    return balance;
 }
 void checkCurrentBalance(){
    System.out.println("Current Balance: " + balance);
 }
 public static void main(String [] args){
    BankApllication ba = new BankApllication();
    System.out.println("this is the static variable calling"+" "+balance);
    ba.checkCurrentBalance();
    ba.withdrawal(1000);
    ba.deposit(30000);
 }

}