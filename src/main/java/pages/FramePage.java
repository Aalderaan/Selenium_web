package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramePage {

    WebDriver driver;
    private By nestedFrame = By.linkText("Nested Frames");

    public FramePage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFrame clickNestedFrame() {
        driver.findElement(nestedFrame).click();
        return new NestedFrame(driver);
    }
}
