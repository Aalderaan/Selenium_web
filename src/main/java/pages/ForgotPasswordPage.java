package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");
    public static final String EMAIL = "qwer@gmail.com";

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(EMAIL);
    }

    public VerifiedPage retrievePassword() {
        driver.findElement(retrievePasswordButton).click();
        return new VerifiedPage(driver);
    }
}
