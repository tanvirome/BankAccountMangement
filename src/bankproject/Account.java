
package bankproject;

public class Account {
    //member variable / properties
    private String accName = "";
    private String accid = "";
    private double balance = 0.0;
    private Transaction listOfTransaction[];
    private int totalNumberOfTransaction = 0;
    
    //constructor
    public Account(){ } //empty constructor
    public Account(String name, String acno, double b)
    {
        this.accName = name;
        this.accid = acno;
        this.balance = b;
        listOfTransaction = new Transaction[100000];
        System.out.println("Account Created.");
    }
    public void addTransaction(Transaction t)
    {
        listOfTransaction[totalNumberOfTransaction] = t;
        totalNumberOfTransaction++;
    }
    public void deposit(double amount)
    {
        this.balance += amount;
        Transaction t = new Transaction(this, this, amount, "Deposit");
        addTransaction(t);
        
    }
    public void withdraw(double amount)
    {
        this.balance -= amount;
        Transaction t = new Transaction(this, this, amount, "Withdraw");
        addTransaction(t);
    }
    
    public void transfer(double amount, Account rec)
    {
        this.balance -= amount;
        rec.balance += amount;
        Transaction t = new Transaction(this, rec, amount, "Transfer");
        addTransaction(t);
    }

    
    public String getAccid(){return accid;}
    
    
    //helper method
    public void showInfo()
    {
        System.out.println("Account Details -");
        System.out.println("Account No.: " + this.accid);
        System.out.println("Account Name.: " + this.accName);
        System.out.println("Account Balance: " + this.balance);
    }
    public void showAllTransaction()
    {
        System.out.println("Total Number Of Transaction : " + this.totalNumberOfTransaction);
        for(int i=0; i<totalNumberOfTransaction; i++)
        {
            listOfTransaction[i].showInfo();
        }
    }
}
