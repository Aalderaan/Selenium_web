package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramePage {

    WebDriver driver;
    private By leftFrame = By.name("frame-left");
    private By bottomFrame = By.name("frame-bottom");

    public IFramePage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFrame clickNestedFrame() {
        driver.findElement()
    }


}
