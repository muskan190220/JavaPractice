package Inheritance;
import java.sql.Date;

class Accounts {
    private long accno;
    private String name;
    private String addr;
    private long phno;
    private Date dob;
    protected long bal;
        
        public long getAccno() { return accno; }
        public String getName() { return name; }
        public String getAddr() { return addr; }
        public long getPhno() { return phno; }
        public Date getDob() { return dob; }
        public long getBal() { return bal; }
    
        public void setAddr(String addr)
        {
            this.addr = addr;
        }
    
        public void setPhno(long phno)
        {
            this.phno = phno;
        }
    
        //Constructor
    
        public Accounts(long accno, String name, String addr, Long phno, Date dob, long bal)
        {
            this.accno = accno;
            this.name = name;
            this.addr = addr;
            this.phno = phno;
            this.dob = dob;
            bal = 0;
    
        }
    }
    
    public class SavingsAccount extends Accounts
    {
        public long amt;
    
        public void deposit(long amt)
        {
            bal = bal+amt;
        }

        public void withdraw(long amt)
        {
            bal = bal-amt;
        }

    }
    class LoanAccount extends Accounts{

        public void payEMI(long amt)
        {
            bal-=amt;
        }
        public void repay(long amt)
        {
            if(bal==amt)
                bal=0;
        }   
    }

    public class Test
    {
        public static void main(String args[])
        {

        }
    }