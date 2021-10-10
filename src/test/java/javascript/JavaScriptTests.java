package javascript;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeAndDeepDomPage;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        LargeAndDeepDomPage page = homePage.clickLargeAndDeepDom();
        page.scrollToTable();
        Assert.assertTrue(page.tableIsVisible(), "The Table is not visible");
    }

    @Test
    public void testScrollToFifthParagraph(){
        InfiniteScrollPage page = homePage.clickInfiniteScroll();
                page.scrollToParagraph(5);

        Assert.assertTrue(page.textBlockIsVisible(), "Text block is not visible");
    }
}
