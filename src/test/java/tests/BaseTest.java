package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;

import java.time.Duration;
@Listeners(TestListener.class)
public class BaseTest {
    WebDriver driver;
    BasePage basePage;
    HomePage homePage;
    LoginPage loginPage;
    NewAccountModal newAccountModal;
    NewContactModal newContactModal;


    public static final String USER = "saifulina.qa-yx5p@force.com";
    public static final String PASSWORD = "alesia1234567890";

    @BeforeMethod(description = "Opening browser")
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        basePage = new BasePage(driver);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        newAccountModal = new NewAccountModal(driver);
        newContactModal = new NewContactModal(driver);
    }

    @AfterMethod(alwaysRun = true, description = "Close browser")
    public void close() {
        driver.quit();
    }
}
