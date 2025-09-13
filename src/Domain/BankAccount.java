package Domain;

public class BankAccount {
    private double balance;
    public double getBalance(){
        return this.balance;
    }
    public void withDraw(double amount){
        if(amount<0 || amount > this.balance){
            return;
        }
        this.balance = this.balance- amount;
    }
    public void deposit(double amount){
        if(amount < 0){
            return;
        }
        this.balance = this.balance + amount;
    }

}
