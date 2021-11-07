package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By horizontalSlider = By.cssSelector("input[type=range]");
    private By result = By.id("range");



    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void slide(double number) {
        double step = 0.5;
        double check = 0.0;
        while(check < number) {
            check += step;
            driver.findElement(horizontalSlider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getValue() {
        return  driver.findElement(result).getText();
    }
}