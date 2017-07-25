import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AboutUsPage extends RegularSitePage {

    private By aboutUsLink = By.linkText("About Us");
    private String aboutUsTitle = "About Us | S3";

    public AboutUsPage(WebDriver driver){
        super(driver);
        pageUrl = "http://s3.com/about-us/";
        pageTitle = "About Us | S3";
    }

    public AboutUsPage getOnPage() {
        assertTrue(driver.findElement(aboutUsLink).isDisplayed());
        driver.findElement(aboutUsLink).click();
        assertEquals(aboutUsTitle, driver.getTitle());
        return new AboutUsPage(driver);
    }
}
