   class bank1{
      int acc_no;
      String name;
      float amount;
      void insert(int a,String n,float amt){
          acc_no = a;
          name = n;
          amount = amt;
      }
      void deposit(float amt){
          amount = amount+amt;
          System.out.println(amt + "deposited");
      }
      void withdraw(float amt){
          if (amount<amt){
              System.out.println("insufficient balance");}
              else{
              amount = amount-amt;
              }
              System.out.println(amt+ "withdraw");

      }
      void checkbalance(){
          System.out.println("balance is :"+ amount);}
          void display(){
              System.out.println(acc_no+" "+name+" "+amount);}

   }


   public class BANK {
    public static void main(String args[]){
      bank1 b1 = new bank1();
      b1.insert(123456,"mouni",5000);
      b1.display();
      b1.checkbalance();
      b1.deposit(10000);
      b1.checkbalance();
      b1.withdraw(2000);
      b1.checkbalance();
    }
}
