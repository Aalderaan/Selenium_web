package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifiedPage {

    private WebDriver driver;
    private By verifiedStatus = By.cssSelector("body > h1");

    public VerifiedPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVerfiedStatusText() {
       return driver.findElement(verifiedStatus).getText();
    }
}
