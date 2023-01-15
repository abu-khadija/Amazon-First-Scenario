package Tests;

import Pages.ChooseItemClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChooseItemTest extends TestBase {
    @Test
    public void Choose(){
        ChooseItemClass choose;
        choose = new ChooseItemClass(driver);

        choose.Item();
        //assertion
        String expectedResult = "In Stock.";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"availability\"]/span")).getText();
        Assert.assertEquals(actualResult, expectedResult);

    }
}
