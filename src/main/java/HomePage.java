import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;
import org.openqa.selenium.By;

/**
 * Created by ashendri on 25.07.2017.
 */
public class HomePage extends BasePage {

    private By searchDiv = By.id("et_top_search");
    private By searchInput = By.xpath("//input[contains(@class, 'et-search-field')]");


    public HomePage(WebDriver driver){
        super(driver);
    }

    public void getOn() {
        driver.get("http://s3.com/");
        assertEquals("S3 | Home", driver.getTitle());
    }

    public void searchText(String textToSearch) {
        driver.findElement(searchDiv).click();
        assertTrue(driver.findElement(searchInput).isDisplayed());
        driver.findElement(searchInput).sendKeys(textToSearch);
        driver.findElement(searchInput).sendKeys(Keys.ENTER);
        assertEquals(String.format("Search results for \"%s\" | S3", textToSearch), driver.getTitle());
    }
}
