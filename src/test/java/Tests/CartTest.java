package Tests;

import Pages.CartClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CartTest extends TestPages.TestBase {
    @Test
    public void CART() throws InterruptedException {
        CartClass C;
        C = new CartClass(driver);

        C.Cart();

        //assertion
        driver.findElement(By.id("sc-buy-box-ptc-button-announce")).isDisplayed();
    }

}
