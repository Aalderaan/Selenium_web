package slider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;


public class HorizontalSliderTests extends BaseTests {
    private static final int NUMBER = 4;

    @Test
    public void testValue() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.slide(NUMBER);
        Assert.assertEquals(horizontalSliderPage.getValue(), String.valueOf(NUMBER));
    }
}