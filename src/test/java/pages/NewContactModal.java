package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.TextArea;

public class NewContactModal extends BasePage {
    public static final By NEW_CONTACT = By.cssSelector("a[title=New]");
    public static final By SAVE_BUTTON = By.xpath("//div[contains(@class, 'modal-body')]//" +
            "button[@name='SaveEdit']");


    public NewContactModal(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(baseUrl + "/o/Contact/list?filterName=Recent");
        waitForPageLoaded();
    }
    public void clickNewContact() {
        driver.findElement(NEW_CONTACT).click();
    }
    public void create(String firstName, String lastName, String phone, String mobile, String typeSalutation,
                       String email, String title, String fax, String typeLeadSource, String text,
                       String accountName) {

        new Input(driver, "First Name").write(firstName);
        new Input(driver, "Last Name").write(lastName);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Mobile").write(mobile);
        new DropDown(driver, "Salutation").select(typeSalutation);
        new Input(driver, "Email").write(email);
        new Input(driver, "Title").write(title);
        new Input(driver, "Fax").write(fax);
        new DropDown(driver, "Lead Source").select(typeLeadSource);
        new TextArea(driver, "Mailing Street").writeDescriptionOfContact(text);
        new Input(driver, "Account Name").write(accountName);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(SAVE_BUTTON)));
    }


    public void saveContact() {
        driver.findElement(SAVE_BUTTON).click();
        waitForPageLoaded();
    }
}
