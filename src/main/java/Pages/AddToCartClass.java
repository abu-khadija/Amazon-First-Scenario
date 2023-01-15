package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartClass extends PageBase{

    //Constructor
    public AddToCartClass(WebDriver driver) {super(driver);}

    // add to cart Button
    private final By add = By.id("add-to-cart-button");

    // Click add to cart method
    public void Add() throws InterruptedException {
        driver.findElement(add).click();
        Thread.sleep(2500);
    }
}
