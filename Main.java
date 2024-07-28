public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100); 
        ATM atm = new ATM(account); 
        atm.run(); 
    }
}
