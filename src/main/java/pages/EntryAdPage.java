package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {

    WebDriver driver;
    private By closeButton = By.cssSelector("#modal > div.modal > div.modal-footer > p");
    private By modalTitleText = By.cssSelector("#modal > div.modal > div.modal-title > h3");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCloseButton() {
        driver.switchTo().activeElement().findElement(closeButton);
    }

    public boolean isModalDisplayed() {
        return driver.switchTo().activeElement().isDisplayed();
    }

    public String getModalTitle() {
      return driver.switchTo().activeElement().getText();
    }
}