package bank;

import java.time.LocalDate;
import java.util.ArrayList;

public class SaveAccount {
    protected double totalMoney; 
    protected ArrayList<AccountOperation> accountData; 
    protected String personID;
    protected String accountType; 
    protected LocalDate creationDate; 

    public SaveAccount (String personID) {
        this.accountType = "Save Account";
        creationDate = LocalDate.now();
        accountData = new ArrayList<AccountOperation>();
    }

    public boolean depositMoney(double money, String date) { 
        totalMoney += money;
        addOperationToAccountData(money, "WITHDRAW", date);
        return true;
    }

    public boolean withdrawMoney(double money, String date) {
        if (money > totalMoney) {
            return false;
        } else {
            totalMoney -= money;
            addOperationToAccountData(money, "WITHDRAW", date);
            return true;
        }
    }

    protected boolean addOperationToAccountData (double money, String operationName, String date) {
        AccountOperation accountOperation = new AccountOperation(money, operationName, date);
        boolean result = accountData.add(accountOperation);
        return result;
    }

    public String getPersonID() {
        return personID;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

}
