package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChooseItemClass extends PageBase{
    //Constructor
    public ChooseItemClass(WebDriver driver) {super(driver);}

    private final By item = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div[3]/div[1]/h2/a/span");


    public void Item(){
        driver.findElement(item).click();
    }
}
