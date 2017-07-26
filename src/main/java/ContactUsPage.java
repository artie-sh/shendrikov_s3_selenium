import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContactUsPage extends RegularSitePage {

    private By contactUsLink = By.linkText("Contact Us");


    public ContactUsPage(WebDriver driver){
        super(driver);
        pageTitle = "Contact Us | S3";
    }

    public ContactUsPage getOnPage() {
        assertTrue(driver.findElement(contactUsLink).isDisplayed());
        driver.findElement(contactUsLink).click();
        assertEquals(pageTitle, driver.getTitle());
        return new ContactUsPage(driver);
    }
}
