package bank;

import org.junit.Test;
import static org.junit.Assert.*;

public class SaveAccountTest {
    @Test
    public void testDepositMoneyShouldAddTotalMoney() {
        SaveAccount saveAccount = new SaveAccount("1234");
        saveAccount.depositMoney(12, "2021-12-15 15:59");
        double result = saveAccount.getTotalMoney();
        double expected = 12; 
        assertEquals(expected, result, 0.0);
    } 

    @Test
    public void testWithdrawShouldWithdrawMoney() {
        SaveAccount saveAccount = new SaveAccount("1234");
        saveAccount.depositMoney(100, "2021-12-15 15:59");
        assertTrue(saveAccount.withdrawMoney(100, "2021-12-15 16:59")); 
    } 

    @Test
    public void testWithdrawShouldNotWithdrawMoneyIfThereIsNotEnoughtMoney() {
        SaveAccount saveAccount = new SaveAccount("1234");
        saveAccount.depositMoney(100, "2021-12-15 15:59");
        assertFalse(saveAccount.withdrawMoney(150, "2021-12-15 16:59"));
    } 
    

}
