package Tests;

import Pages.SearchClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends TestPages.TestBase {
    @Test
    public void Search() throws InterruptedException {
        SearchClass search;
        search = new SearchClass(driver);

        search.Search();

        String expectedResult = "Automotive";
        String actualResult = driver.findElement(By.linkText("Automotive")).getText();
        Assert.assertEquals(actualResult, expectedResult);

    }

}
