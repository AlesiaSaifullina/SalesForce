package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest{

    @Test(description = "Authorization check")
    public void login() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        Assert.assertEquals(homePage.title(), "Home");
    }
}



//saifulina.qa-hydk@force.com
//alesia1234567890
//https://gippo2.my.salesforce.com
