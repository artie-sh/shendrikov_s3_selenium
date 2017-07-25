import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by ashendri on 25.07.2017.
 */


//basic class from which all pages will inherit
public class BasePage {

    protected WebDriver driver;
    protected String pageUrl;
    protected String pageTitle;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
    }

    //method allowing to check for element presence and not crashing test when it's not
    public boolean isElementPresent(By locatorKey) {
        try {
            driver.findElement(locatorKey);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
