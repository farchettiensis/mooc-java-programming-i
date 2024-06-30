
public class YourFirstAccount {

    public static void main(String[] args) {
        Account theHuttAccount = new Account("Dr. Jamil's account", 100.0);
        
        theHuttAccount.deposit(20);
        
        System.out.println(theHuttAccount);
    }
}
