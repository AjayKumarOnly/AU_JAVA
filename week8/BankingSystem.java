class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String m){
        super(m);
    }
}
class InvalidAmountException extends Exception{
    public InvalidAmountException(String m){
        super(m);
    }
}
class Bank{
    private double balance;
    private int accountID;
    private String name;
        public  void deposit(double amount){
            try{
                if(amount <= 0 ) throw new InvalidAmountException("Amount is negative ");
                balance += amount;
                System.out.println("Deposited Successfully");
            }
            catch(InvalidAmountException e){
                System.out.println(e.getMessage());
            }
        }
        public void withdraw (double amount){
            try{
                if(amount > balance) throw new InsufficientFundsException("Amount is greater than the Balance");
                if(amount <= 0) throw new InvalidAmountException("Withdraw amount should be positive");
                balance -= amount;
                System.out.println("Withdrew Successfully");
            }
             catch(InsufficientFundsException | InvalidAmountException e){
                System.out.println(e.getMessage());
            }
        }
        public void transfer(int account , double amount){
            try{
                if(account <=0 ) throw new IllegalArgumentException("Valid Accounts are  only allowed");
                if(amount <=0) throw new InvalidAmountException("Amount should be always positive");
                if(amount < balance) throw new InsufficientFundsException("This amount is greater than Balance!!");
                this.balance -= amount;
                System.out.println("Transferred amount successfully...");
            }
            catch(IllegalArgumentException | InvalidAmountException | InsufficientFundsException e){
                System.out.println(e.getMessage());
            }
        }
     Bank(int accountID , String name,double balance){
         this.accountID = accountID;
         this.balance = balance;
         this.name =name;
     }
}

public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("Name : Ajay Kumar S");
        System.out.println("Roll no : 2024503701");
        Bank emp = new Bank(101,"AJay",5000);
        emp.deposit(100);
        emp.deposit(-5);

        emp.withdraw(10000);
        emp.withdraw(50);

        emp.transfer(121,200);
        emp.transfer(-1,500);


    }
}
