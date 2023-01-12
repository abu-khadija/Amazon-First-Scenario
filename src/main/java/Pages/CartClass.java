package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CartClass extends PageBase{
    public CartClass(WebDriver driver) {super(driver);}

    private final By CartButton = By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input");



    public void Cart() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(CartButton));
    }
}
