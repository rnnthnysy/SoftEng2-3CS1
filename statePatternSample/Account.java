package statePatternSample;

public class Account {
    String accountNumber;
    double balance;
    private AccountState accountState;

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }

    public AccountState getState(){
        return accountState;
    }

    public void setState(AccountState accountState){
        this.accountState = accountState;
    }

    public void deposit(double depositAmount){
        accountState.deposit(depositAmount, this);
    }

    public void withdraw(double withdrawAmount){
        accountState.withdraw(withdrawAmount, this);
    }

    public void suspend(){
        accountState.suspend(this);
    }

    public void activate(){
        accountState.activate(this);
    }
    public void close(){
        accountState.close(this);
    }

    public String toString(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
        return null;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public AccountState getAccountState(){
        return accountState;
    }

    public void setAccountState(AccountState accountState){
        this.accountState = accountState;
    }
}
