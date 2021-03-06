package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFrame {

    WebDriver driver;
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private String topFrame = "frame-top";
    private By body = By.tagName("body");


    public NestedFrame(WebDriver driver) {
        this.driver = driver;
    }


    public String getLeftFrameText() {
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getBottomFrameText() {
        driver.switchTo().frame(bottomFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getFrameText() {
        return driver.findElement(body).getText();
    }
}
