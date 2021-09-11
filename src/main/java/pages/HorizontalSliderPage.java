package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    private final WebDriver driver;
    private final By horizontalSlider = By.cssSelector("input[type=range]");
    private final By result = By.xpath("//*[@id=\"range\"]");



    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void slide(double number) {
        double check = 0;
        while(check < number) {
            check += 0.5;
            driver.findElement(horizontalSlider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getValue() {
        return  driver.findElement(result).getText();
    }
}