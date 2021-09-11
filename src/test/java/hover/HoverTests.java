package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoversPage;

public class HoverTests extends BaseTests  {

    @Test
    public void testHoverUser1() {
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);
        Assert.assertTrue(caption.isCaptionDisplayed(), "Caption not dislplayed");
        Assert.assertEquals(caption.getTitle(), "name: user1", "Caption title incorect");
        Assert.assertEquals(caption.getLink(), "http://the-internet.herokuapp.com/users/1", "Caption link text incorrect");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}
