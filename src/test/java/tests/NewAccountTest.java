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
        Account account = Account.builder()
                .accountName("Alesia")
                .parentAccountName("Alesia")
                .website("teachmeskills.by")
                .phone("1234567")
                .fax("9876543")
                .employees("15")
                .revenue("900")
                .city("Minsk")
                .state("Minsk")
                .zipCode("220085")
                .country("Belarus")
                .type("Analyst")
                .industryType("Banking")
                .description("description")
                .billingStreet("billing street")
                .shippingStreet("shipping street")
                .build();
        newAccountModal.create(account);
        newAccountModal.save();
    }
}
