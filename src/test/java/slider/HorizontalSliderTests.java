package slider;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;
//import pages.SliderCaption;

public class HorizontalSliderTests extends BaseTests {
    private final int number = 4;

    @Test
    public void testHorizontalSlider() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.slide(number);

    }

    @Test
    public void testValue() {
        HorizontalSliderPage horizontalSliderPage1 = homePage.clickHorizontalSlider();
        horizontalSliderPage1.slide(number);
        Assert.assertEquals(horizontalSliderPage1.getValue(), "4");
    }
}
