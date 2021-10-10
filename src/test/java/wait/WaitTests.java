package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExamle1Page;
import pages.DynamicLoadingExample2Page;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden() {
        DynamicLoadingExamle1Page loadingPage = homePage.clickDynamicLoading()
                .clickExample1();
        loadingPage.clickStart();
        Assert.assertEquals(loadingPage.getLoadedText(), "Hello World!",
                "Loaded text incorrect");
    }

    @Test
    public void testWaitUntilVisible() {
       DynamicLoadingExample2Page loadingPage = homePage.clickDynamicLoading()
                .clickExample2();
        loadingPage.clickStart();
        Assert.assertEquals(loadingPage.getLoadedText(), "Hello World!",
                "Loaded text incorrect");
    }
}
