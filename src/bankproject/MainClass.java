
package bankproject;

public class MainClass {

    public static void main(String[] args) {
        // TODO code application logic here
        Account ac1 = new Account("Tanvir Ahamed Ome", "1564984163", 10000);
        Account ac2 = new Account("Tanvir Ome", "15649844854", 5500);
        ac1.transfer(500, ac2);
        
        ac1.showInfo();
        ac2.showInfo();
        ac1.deposit(500);
        ac1.showInfo();
        ac1.showAllTransaction();
    }
    
}
