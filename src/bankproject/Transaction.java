
package bankproject;

public class Transaction {
    //member variable
    private Account sender;
    private Account receiver;
    private double amount = 0;
    private String additionalInfo = "";
    
    //constructor
    
    public Transaction(){}
    public Transaction(Account sen, Account rec, double a, String info)
    {
        this.sender = sen;
        this.receiver = rec;
        this.amount = a;
        this.additionalInfo = info;
    }
    public void showInfo()
    {
        System.out.println("Transaction Details____");
        System.out.println("Sender Are : " + this.sender.getAccid());
        System.out.println("Receiver Are : " + this.receiver.getAccid());
        System.out.println("Amount : " + this.amount);
        System.out.println("Information : " + this.additionalInfo);
    }
}
