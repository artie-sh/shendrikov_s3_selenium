import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;
import org.openqa.selenium.By;

/**
 * Created by ashendri on 25.07.2017.
 */
public class HomePage extends RegularSitePage {

    private String pageUrl = "http://s3.com/";

    public HomePage(WebDriver driver){
        super(driver);
        pageTitle = "S3 | Home";
    }

    public HomePage getOnPage() {
        driver.get(pageUrl);
        assertEquals(pageTitle, driver.getTitle());
        return new HomePage(driver);
    }

}
