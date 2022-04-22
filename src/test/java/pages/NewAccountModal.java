package pages;

import dto.Account;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.TextArea;

@Log4j2
public class NewAccountModal extends BasePage{

    public static final By NEW_ACCOUNT = By.cssSelector("a[title=New]");
    public static final By SAVE_BUTTON = By.cssSelector("[title=Save]");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }
    public void open() {
        driver.get(baseUrl + "/o/Account/list?filterName=Recent");
        waitForPageLoaded();
    }
    public void clickNewAccount() {
        driver.findElement(NEW_ACCOUNT).click();
    }

    public void create(Account account) {
        log.info("Creation of account {}", account);
       new Input(driver, "Account Name").write(account.getAccountName());
       new Input(driver, "Parent Account").write(account.getParentAccountName());
       new Input(driver, "Website").write(account.getWebsite());
       new Input(driver, "Phone").write(account.getPhone());
       new Input(driver, "Fax").write(account.getFax());
       new Input(driver, "Billing City").write(account.getEmployees());
       new Input(driver, "Annual Revenue").write(account.getRevenue());
       new Input(driver, "Billing City").write(account.getCity());
       new Input(driver, "Billing State/Province").write(account.getState());
       new Input(driver, "Billing Zip/Postal Code").write(account.getZipCode());
       new Input(driver, "Billing Country").write(account.getCountry());
       new Input(driver, "Copy Billing Address to Shipping Address").click();
       new DropDown(driver, "Type").select(account.getType());
       new DropDown(driver, "Industry").select(account.getIndustryType());
       new TextArea(driver, "Description").writeDescriptionOfAccount(account.getDescription());
       new TextArea(driver, "Billing Street").writeDescriptionOfAccount(account.getBillingStreet());
       new TextArea(driver, "Shipping Street").writeDescriptionOfAccount(account.getShippingStreet());

    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
        waitForPageLoaded();
    }
}
