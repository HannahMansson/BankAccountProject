import java.util.Scanner;

public class BankAccount {
    private int account;
    private int savings;
    final Scanner scan = new Scanner(System.in);

    public int getAccountBalance() {
        return account;
    }

    public void putMoneyIn(int money) {
        account = account + money;
        System.out.println("Your balance is: " + account);
        System.out.println("Please choose again or enter stop");
    }

    public void takeMoneyOut(int money) {
        account = account - money;
        System.out.println("Your balance is now: " +getAccountBalance());
        System.out.println("Please choose again or enter stop");
    }

    public String choice(String choice) {
        String myString = "";
        switch (choice) {

            case "B" -> {
                myString = "Your balance is: ";
                System.out.println("Your balance is: " + account);
                System.out.println("Please choose again or enter stop");
            }

            case "W" -> {
                myString = "Okay, how much would you like to withdrawal?";
                System.out.println(myString);
                int moneyOut = Integer.parseInt(scan.nextLine());
                if (moneyOut > account) {
                    System.out.println("Sorry, you do not have that amount");
                    System.out.println("Please choose again or enter stop");
                } else {
                    takeMoneyOut(moneyOut);
                }
            }

            case "P" -> {
                myString = "Okay, how much would you like to put in?";
                System.out.println(myString);
                int moneyIn = Integer.parseInt(scan.nextLine());
                putMoneyIn(moneyIn);
            }

            case "M" -> {
                myString = "Okay, how much would you like to move to your savings?";
                System.out.println(myString);
                int moneyMove = Integer.parseInt(scan.nextLine());
                if (moneyMove > account) {
                    System.out.println("Sorry, that amount is larger then your balance");
                    System.out.println("Please choose again or enter stop");
                } else {
                    savings(moneyMove);
                    System.out.println("Your savings balance is now: " + getSavingsBalance());
                    System.out.println("Please choose again or enter stop");
                }
            }

            case "A" -> {
                myString = "Okay, how much would you like to move to your account?";
                System.out.println(myString);
                int moveMoney = Integer.parseInt(scan.nextLine());
                if (moveMoney > savings) {
                    System.out.println("Sorry, that amount is larger then your balance");
                    System.out.println("Please choose again or enter stop");
                } else {
                    moveBack(moveMoney);
                    System.out.println("Your savings balance is now: " + getSavingsBalance());
                    System.out.println("and your account balance is: " + getAccountBalance());
                    System.out.println("Please choose again or enter stop");
                }
            }
        }
        return myString;
        }

    public boolean getStop(String choice) {
        return choice.contains("STOP");
    }

    public void savings(int money) {
        savings = savings + money;
        account = account - money;
    }

    public int getSavingsBalance() {
        return savings;
    }

    public void moveBack(int money) {
        account = account + money;
        savings = savings - money;
    }

}

