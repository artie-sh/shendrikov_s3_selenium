import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ashendri on 26.07.2017.
 */

//base test class from which other test classes inherit
public class BaseTest {

    protected WebDriver driver;

    @Before
    public void startUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
