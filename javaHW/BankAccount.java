public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int balance){
        this.owner = owner;
        if(balance < 0) balance = 0;
        this.balance = balance;
    }
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        if (amount <= 0) return;
        balance += amount;
    }
    public boolean withdraw(int amount){
        if (amount <= 0) return false;
        if(amount > balance) return false;
        balance -= amount;
        return true;
    }

}