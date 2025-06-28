package cognizant;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountTest {
    private BankAccount account;
    private static int testCount = 0;
    private static final String TEST_ACCOUNT_NUMBER = "ACC123456";
    private static final double INITIAL_BALANCE = 1000.00;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Starting Bank Account Test Suite");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Bank Account Test Suite Completed");
    }

    @Before
    public void setUp() throws Exception {
        account = new BankAccount(TEST_ACCOUNT_NUMBER, INITIAL_BALANCE);
        testCount++;
        System.out.println("Setting up for test #" + testCount);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Cleaning up after test #" + testCount);
    }

    @Test
    public void deposit_positiveAmount_shouldIncreaseBalance() {
        // Arrange
        double depositAmount = 500.00;
        double expectedBalance = INITIAL_BALANCE + depositAmount;
        
        // Act
        account.deposit(depositAmount);
        
        // Assert
        assertEquals("Balance should increase by deposit amount",
                   expectedBalance, 
                   account.getBalance(), 
                   0.001);
    }

    @Test
    public void withdraw_validAmount_shouldDecreaseBalance() {
        // Arrange
        double withdrawalAmount = 200.00;
        double expectedBalance = INITIAL_BALANCE - withdrawalAmount;
        
        // Act
        boolean result = account.withdraw(withdrawalAmount);
        
        // Assert
        assertTrue("Withdrawal should succeed", result);
        assertEquals(expectedBalance, account.getBalance(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw_negativeAmount_shouldThrowException() {
        // Arrange & Act (exception asserted via annotation)
        account.withdraw(-100.00);
    }

    @Test
    public void getAccountNumber_shouldReturnCorrectNumber() {
        // Arrange already done in setUp()
        
        // Act
        String accountNumber = account.getAccountNumber();
        
        // Assert
        assertEquals(TEST_ACCOUNT_NUMBER, accountNumber);
    }

    @Test
    public void getBalance_shouldReturnInitialBalance() {
        // Arrange already done in setUp()
        
        // Act
        double balance = account.getBalance();
        
        // Assert
        assertEquals(INITIAL_BALANCE, balance, 0.001);
    }
}
