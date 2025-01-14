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
    
    class SavingsAccount extends Accounts
    {
        public long amt;

        public SavingsAccount
    
        public void deposit(long amt)
        {
            bal = bal+amt;
        }

        public void withdraw(long amt)
        {
            bal = bal-amt;
        }

    
}
