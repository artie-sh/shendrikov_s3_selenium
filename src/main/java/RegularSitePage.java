import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegularSitePage extends BasePage {

    //elements needed to test search functionality which is present on all pages except for sign in
    private By searchInput = By.xpath("//input[contains(@class, 'et-search-field')]");
    private By searchDiv = By.id("et_top_search");

    private By articlesFound = By.xpath("//div[@id='left-area']/article");
    private By noResultsFound = By.xpath("//div[@id='left-area']//h1[contains(text(), 'No Results Found')]");


    public RegularSitePage(WebDriver driver){
        super(driver);
    }

    //since search functionality is present on almost all site pages, the searchText() method is nested
    //in the RegularSitePage class, from which most of the pages inherit (except for login pages)
    public void searchText(String textToSearch) {
        assertTrue(driver.findElement(searchDiv).isDisplayed());
        driver.findElement(searchDiv).click();

        assertTrue(driver.findElement(searchInput).isDisplayed());
        driver.findElement(searchInput).sendKeys(textToSearch);
        driver.findElement(searchInput).sendKeys(Keys.ENTER);

        assertEquals(String.format("Search results for \"%s\" | S3", textToSearch), driver.getTitle());
        assertTrue(driver.findElement(articlesFound).isDisplayed());
        assertFalse(isElementPresent(noResultsFound));

    }
}
