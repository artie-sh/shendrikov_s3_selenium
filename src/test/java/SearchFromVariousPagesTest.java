import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by ashendri on 25.07.2017.
 */

//test suite checking the search functionality on various site pages
public class SearchFromVariousPagesTest extends BaseTest {

    private String textToSearch = "financial services";

    @Test
    public void searchFromHomePageTest() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.getOnPage();
        homePage.searchText(textToSearch);
    }

    @Test
    public void searchFromCareersPageTest() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.getOnPage();
        CareersPage careersPage = new CareersPage(driver);
        careersPage.getOnPage();
        careersPage.searchText(textToSearch);
    }

    @Test
    public void searchFromContactUsPageTest() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.getOnPage();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.getOnPage();
        contactUsPage.searchText(textToSearch);
    }

    @Test
    public void searchFromAboutUsPagePageTest() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.getOnPage();
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        aboutUsPage.getOnPage();
        aboutUsPage.searchText(textToSearch);
    }

    @Test
    public void searchFromNewsAndEventsPageTest() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.getOnPage();
        NewsAndEventsPage newsAndEventsPage = new NewsAndEventsPage(driver);
        newsAndEventsPage.getOnPage();
        newsAndEventsPage.searchText(textToSearch);
    }
}