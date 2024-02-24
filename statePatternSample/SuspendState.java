package statePatternSample;

public class SuspendState implements AccountState{

    @Override
    public void deposit(double depositAmount, Account account){
        System.out.println("You cannot deposit on a suspended account!");
    }

    @Override
    public void withdraw(double withdrawAmount, Account account){
        System.out.println("You cannot withdraw on a suspended account!");
    }

    @Override
    public void suspend(Account account){
        account.setState(new SuspendState());
        System.out.println("Account is already suspended!");
    }

    @Override
    public void close(Account account){
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }

    @Override
    public void activate(Account account) {
        account.setState(new ActiveState());
        System.out.println("Account is activated!");
    }
}
