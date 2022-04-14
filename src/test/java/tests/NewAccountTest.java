package tests;

import dto.Account;
import org.testng.annotations.Test;

public class NewAccountTest extends BaseTest{

    @Test(description = "Create new Account")
    public void createNewAccount() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        newAccountModal.open();
        newAccountModal.clickNewAccount();
        Account account = new Account("Alesia", "Alesia", "teachmeskills.by",
                "1234567", "9876543", "15", "900", "Minsk", "Minsk",
                "220085", "Belarus", "Analyst", "Banking",
                "description", "billing street", "shipping street");
        newAccountModal.create(account);
        newAccountModal.save();
    }
}
