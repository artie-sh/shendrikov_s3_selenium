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
//        System.setProperty("webdriver.ie.driver", "C:\\DriversForSelenium2\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        HomePage homePage = new HomePage(driver);
        homePage = homePage.getOn();
    }

}