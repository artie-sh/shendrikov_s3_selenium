import org.junit.Test;

/**
 * Created by ashendri on 26.07.2017.
 */

//test class with one test checking sign in functionality
public class SignInTest extends BaseTest {

    private String userEmail = "test@mail.com";
    private String userPassword = "123456";

    //this test will fail, because i'm using invalid credentials
    @Test
    public void signInTest() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.getOnPage();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.getOnPage();
        signInPage.signIn(userEmail, userPassword);
    }
}
