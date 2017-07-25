import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.IOException;

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
    public void searchFromHomePageTest() throws Exception {
        HomePage homePage = new HomePage(this.driver);
        homePage.getOnPage();
        homePage.searchText(textToSearch);
    }

    @Test
    public void searchFromCareersPageTest() throws Exception {
        HomePage homePage = new HomePage(this.driver);
        homePage.getOnPage();
        CareersPage careersPage = new CareersPage(driver);
        careersPage.getOnPage();
        careersPage.searchText(textToSearch);
    }

    @Test
    public void searchFromContactUsPageTest() throws Exception {
        HomePage homePage = new HomePage(this.driver);
        homePage.getOnPage();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.getOnPage();
        contactUsPage.searchText(textToSearch);
    }

    @Test
    public void searchFromAboutUsPagePageTest() throws Exception {
        HomePage homePage = new HomePage(this.driver);
        homePage.getOnPage();
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        aboutUsPage.getOnPage();
        aboutUsPage.searchText(textToSearch);
    }

    @After
    public void tearDown() throws IOException {
        this.driver.quit();
    }

}