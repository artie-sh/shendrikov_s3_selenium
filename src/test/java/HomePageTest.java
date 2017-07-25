import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.junit.Assert.*;

/**
 * Created by ashendri on 25.07.2017.
 */
public class HomePageTest {
    @Test
    public void getOn() throws Exception {
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        homePage = homePage.getOn();
        homePage.driver.quit();

    }

}