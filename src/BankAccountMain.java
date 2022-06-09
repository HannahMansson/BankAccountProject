import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.println("Welcome! What would you like to do today?");
        System.out.println("Enter B to see your balance");
        System.out.println("Enter W to withdrawal money");
        System.out.println("Enter P to put some money in");
        System.out.println("Enter M to move money from your account to your savings");
        System.out.println("Enter A to move money from your savings to your account");

        String choice = scan.nextLine().toUpperCase();

        account.choice(choice);
        while(!account.getStop(choice)){
            choice = scan.nextLine().toUpperCase();
            account.choice(choice);
        }
    }
}
