import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CareersPage extends RegularSitePage {

    private By careersLink = By.linkText("Careers");
    private String careersTitle = "Careers | S3";

    public CareersPage(WebDriver driver){
        super(driver);
        pageUrl = "http://s3.com/careers/";
        pageTitle = "Careers | S3";
    }

    public CareersPage getOnPage() {
        assertTrue(driver.findElement(careersLink).isDisplayed());
        driver.findElement(careersLink).click();
        assertEquals(careersTitle, driver.getTitle());
        return new CareersPage(driver);
    }
}
