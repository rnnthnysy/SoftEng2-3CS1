package statePatternSample;

public class ActiveState implements AccountState{

    @Override
    public void deposit(double depositAmount, Account account){
        account.balance += depositAmount;
        account.toString();
    }

    @Override
    public void withdraw(double withdrawAmount, Account account){
        account.balance -= withdrawAmount;
        account.toString();
    }

    @Override
    public void suspend(Account account){
        System.out.println("Account is suspended!");
        account.setState(new SuspendState());
    }

    @Override
    public void activate(Account account){
        System.out.println("Account is already activated!");
    }

    @Override
    public void close(Account account){
        System.out.println("Account is closed!");
        account.setState(new ClosedState());
    }

}
