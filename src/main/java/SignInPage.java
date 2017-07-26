import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by ashendri on 26.07.2017.
 */
public class SignInPage extends BasePage {

    //elements needed to interact with the sign in functionality
    private By emailInput = By.id("user_email");
    private By passwordInput = By.id("user_password");
    private By signInInput = By.name("commit");
    private By invalidUserCredsAlert = By.xpath("//li[contains(text(), 'Invalid email or password.')]");
    private By signInButton = By.linkText("Sign In");

    public SignInPage(WebDriver driver){
        super(driver);
        pageTitle = "S3 Financial";
    }

    public SignInPage getOnPage() {
        assertTrue(driver.findElement(signInButton).isDisplayed());
        driver.findElement(signInButton).click();
        assertEquals(pageTitle, driver.getTitle());
        return new SignInPage(driver);
    }

    public void signIn(String email, String password) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(signInInput).click();
        assertFalse(isElementPresent(invalidUserCredsAlert));
    }
}
