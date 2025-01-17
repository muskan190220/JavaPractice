package Inheritance;


class SavingsAccount extends Account
{
    public SavingsAccount(long amt)
    {

    }
    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}


