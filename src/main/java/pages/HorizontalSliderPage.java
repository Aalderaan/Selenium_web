package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By horizontalSlider = By.cssSelector("input[type=range]");


    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void slide(int number) {
        double check = 0.0F;
        while(check < number) {
            check += 0.5;
            driver.findElement(horizontalSlider).sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
