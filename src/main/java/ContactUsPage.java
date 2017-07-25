import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContactUsPage extends RegularSitePage {

    private By contactUsLink = By.linkText("Contact Us");
    private String contactUsTitle = "Contact Us | S3";

    public ContactUsPage(WebDriver driver){
        super(driver);
    }

    public ContactUsPage getOnPage() {
        assertTrue(driver.findElement(contactUsLink).isDisplayed());
        driver.findElement(contactUsLink).click();
        assertEquals(contactUsTitle, driver.getTitle());
        return new ContactUsPage(driver);
    }
}
