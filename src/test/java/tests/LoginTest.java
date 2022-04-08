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



//saifulina.qa-yx5p@force.com
//alesia1234567890
//https://teachmeskills6.my.salesforce.com
