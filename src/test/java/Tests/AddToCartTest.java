package Tests;

import Pages.AddToCartClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends TestPages.TestBase {
    @Test
    public void AddToCart() throws InterruptedException {
        AddToCartClass add;
        add = new AddToCartClass(driver);

        add.Add();



        //assertion
        driver.findElement(By.id("attach-accessory-cart-total-string")).isDisplayed();

    }
}
