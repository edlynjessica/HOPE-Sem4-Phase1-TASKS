class BankAcc{
    private String name;
    private double balance;
    public BankAcc(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited: "+amount+", New Balance: "+balance);
    }
    public void withdraw(double amount)throws Exception{
        if(amount>balance) throw new Exception("Insufficient balance!");
        balance-=amount;
        System.out.println("Withdrew: "+amount+", Remaining Balance: "+balance);
    }
}
public class Task3{
    public static void main(String[] args) {
        BankAcc account=new BankAcc("Ed", 10000);
        account.deposit(5000);
        try {
            account.withdraw(20000);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
