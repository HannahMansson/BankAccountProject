import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void TestGetBankAccount() {

        BankAccount account = new BankAccount();

        int actual = account.getAccountBalance();

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPutMoneyIn(){

        BankAccount account = new BankAccount();

        account.putMoneyIn(500);
        int actual = account.getAccountBalance();

        int expected = 500;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestTakeMoneyOut(){

        BankAccount account = new BankAccount();

        account.takeMoneyOut(500);
        int actual = account.getAccountBalance();

        int expected = -500;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestChoose(){

        BankAccount account = new BankAccount();


        String actual = account.choice("B");
        String expected = "Your balance is: ";


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestStopProgram(){

        BankAccount account = new BankAccount();

        boolean actual = account.getStop("STOP");

        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMoveMoneyToSavings(){

        BankAccount account = new BankAccount();

        account.moveBack(-500);

        int actual = account.getSavingsBalance();

        int expected = 500;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void TestMoveMoneyBackToAccount(){

        BankAccount account = new BankAccount();

        account.savings(-500);

        int actual = account.getAccountBalance();

        int expected = 500;

        Assertions.assertEquals(expected, actual);
    }

}


