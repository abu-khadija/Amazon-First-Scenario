package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartClass extends PageBase{
    public AddToCartClass(WebDriver driver) {super(driver);}

    private final By add = By.id("add-to-cart-button");


    public void Add() throws InterruptedException {
        driver.findElement(add).click();
        Thread.sleep(2500);
    }
}
