package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.DropDown;
import wrappers.Input;

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

    public void create(String accountName, String parentAccountName, String website, String phone, String fax, String employees,
                       String revenue, String city, String state, String zipCode, String country, String type) {
       new Input(driver, "Account Name").write(accountName);
       new Input(driver, "Parent Account").write(parentAccountName);
       new Input(driver, "Website").write(website);
       new Input(driver, "Website").write(website);
       new Input(driver, "Phone").write(phone);
       new Input(driver, "Fax").write(fax);
       new Input(driver, "Billing City").write(employees);
       new Input(driver, "Annual Revenue").write(revenue);
       new Input(driver, "Billing City").write(city);
       new Input(driver, "Billing State/Province").write(state);
       new Input(driver, "Billing Zip/Postal Code").write(zipCode);
       new Input(driver, "Billing Country").write(country);
       new DropDown(driver, "Type").select(type);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
        waitForPageLoaded();
    }
}
