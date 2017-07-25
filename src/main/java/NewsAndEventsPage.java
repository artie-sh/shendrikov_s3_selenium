import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NewsAndEventsPage extends RegularSitePage {

    private By newsAndEventsLink = By.linkText("News and Events");
    private String newsAndEventsTitle = "News and Events | S3";

    public NewsAndEventsPage(WebDriver driver){
        super(driver);
    }

    public NewsAndEventsPage getOnPage() {
        assertTrue(driver.findElement(newsAndEventsLink).isDisplayed());
        driver.findElement(newsAndEventsLink).click();
        assertEquals(newsAndEventsTitle, driver.getTitle());
        return new NewsAndEventsPage(driver);
    }
}
