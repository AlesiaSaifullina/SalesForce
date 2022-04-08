package tests;

import org.testng.annotations.Test;

public class NewContactTest extends BaseTest{

    @Test(description = "Create new contact")
    public void createNewContact() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        newContactModal.open();
        newContactModal.clickNewContact();
        newContactModal.create("Alesia", "Saifullina", "7777777", "8888888",
                "Mrs.", "test@test.com", "5555555", "4444444", "On Site",
                "text", "Alesia");
        newContactModal.saveContact();
        newContactModal.open();
    }
}
