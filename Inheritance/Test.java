package Inheritance;
import java.sql.Date;

class Accounts {
    private long accno;
    private String name;
    private String addr;
    private long phno;
    private Date dob;
    protected long bal;

    // Getters
    public long getAccno() { return accno; }
    public String getName() { return name; }
    public String getAddr() { return addr; }
    public long getPhno() { return phno; }
    public Date getDob() { return dob; }
    public long getBal() { return bal; }

    // Setters
    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

    // Constructor
    public Accounts(long accno, String name, String addr, long phno, Date dob, long bal) {
        this.accno = accno;
        this.name = name;
        this.addr = addr;
        this.phno = phno;
        this.dob = dob;
        this.bal = bal; // Fixed initialization
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends Accounts {
    public SavingsAccount(long accno, String name, String addr, long phno, Date dob, long bal) {
        // Pass the required parameters to the parent class constructor
        super(accno, name, addr, phno, dob, bal);
    }

    public void deposit(long amt) {
        bal += amt;
    }

    public void withdraw(long amt) {
        if (amt <= bal) {
            bal -= amt;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

// Subclass: LoanAccount
class LoanAccount extends Accounts {
    public LoanAccount(long accno, String name, String addr, long phno, Date dob, long loanAmount) {
        // Pass the required parameters to the parent class constructor
        super(accno, name, addr, phno, dob, loanAmount);
    }

    public void payEMI(long amt) {
        if (amt <= bal) {
            bal -= amt;
        } else {
            System.out.println("EMI amount exceeds loan balance.");
        }
    }

    public void repay(long amt) {
        if (amt == bal) {
            bal = 0;
            System.out.println("Loan fully repaid.");
        } else if (amt < bal) {
            bal -= amt;
        } else {
            System.out.println("Repayment amount exceeds loan balance.");
        }
    }
}

// Test Class
public class Test {
    public static void main(String[] args) {
        // Create Savings Account
        SavingsAccount savings = new SavingsAccount(12345, "John Doe", "123 Main St", 9876543210L, Date.valueOf("1990-01-01"), 5000);
        savings.deposit(2000);
        savings.withdraw(1000);
        System.out.println("Savings Account Balance: " + savings.getBal());

        // Create Loan Account
        LoanAccount loan = new LoanAccount(67890, "Jane Doe", "456 Elm St", 9876543211L, Date.valueOf("1985-05-15"), 10000);
        loan.payEMI(2000);
        loan.repay(8000);
        System.out.println("Loan Account Balance: " + loan.getBal());
    }
}
