package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class EnterAdTests extends BaseTests {

    @Test
    public void testEntryAdModul() {
        EntryAdPage entryAdPage = homePage.clickEntryAd();
        entryAdPage.clickCloseButton();
    }

    @Test
    public void testCheckOnModul() {
        EntryAdPage entryAdPage = homePage.clickEntryAd();
        Assert.assertTrue(entryAdPage.isModalDisplayed(), "True");
        Assert.assertEquals(entryAdPage.getModalTitle(), "Entry Ad\n" +
                "Displays an ad on page load.\n" +
                "If closed, it will not appear on subsequent page loads.\n" +
                "To re-enable it, click here.\n" +
                "Powered by Elemental Selenium", "Incorrect result text");
    }
}
