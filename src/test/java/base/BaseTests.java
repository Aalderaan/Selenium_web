package base;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;


public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

        /*List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        inputsLink.click();

        WebElement exampleLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        exampleLink.click();

        List<WebElement> boxlinks = driver.findElements(By.cssSelector("li > a"));
        System.out.println(boxlinks.size());

        System.out.println(driver.getTitle());*/
    }

    @AfterClass
    public void tearDown() {
        driver.quit();

    }
    /*public void getInfo() {

        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("N-ix");

        searchBox.submit();

        WebElement button = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/a"));
        button.click();

    }*/
}

