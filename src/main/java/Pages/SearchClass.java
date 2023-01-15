package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchClass extends PageBase {

    //Constructor
    public SearchClass(WebDriver driver) {super(driver);}

    //Doing Search for item
    private final By SearchBar = By.id("twotabsearchtextbox");
    private final By SearchButton = By.id("nav-search-submit-button");



    //Search for item method
    public void Search() throws InterruptedException {
        driver.findElement(SearchBar).sendKeys("car accessories");
        driver.findElement(SearchButton).click();
        Thread.sleep(1000);

    }






}
