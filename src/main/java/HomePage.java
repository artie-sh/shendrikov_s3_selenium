import org.openqa.selenium.WebDriver;

/**
 * Created by ashendri on 25.07.2017.
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    public HomePage getOn() {
        driver.get("http://s3.com/");
        return new HomePage(driver);
    }
}
