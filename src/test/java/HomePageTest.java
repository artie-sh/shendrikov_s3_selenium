import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

/**
 * Created by ashendri on 25.07.2017.
 */

public class HomePageTest {

    private WebDriver driver;
    private String textToSearch = "financial services";

    @Before
    public void startUp() {
        this.driver = new ChromeDriver();
    }

    @Test
    public void getOnHomePageTest() throws Exception {
        HomePage homePage = new HomePage(this.driver);
        homePage.getOn();
        homePage.searchText(this.textToSearch);


    }

    @After
    public void tearDown() throws Exception {
        this.driver.quit();
    }

}