package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NestedFrame;
import pages.WysiwygEditorPage;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg() {
        WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwygEditor();
        wysiwygEditorPage.clearTextArea();

        String textA = "Hello ";
        String textB = "world!";

        wysiwygEditorPage.setTextArea(textA);
        wysiwygEditorPage.decreaseIndention();
        wysiwygEditorPage.setTextArea(textB);

        Assert.assertEquals(wysiwygEditorPage.getTextFromEditor(), textA + textB, "Text frame incorrect");
    }

    @Test
    public void testNestedFrame() {
        String textLeftFrame = "LEFT";
        String textBottomFrame = "BOTTOM";
        NestedFrame nestedFrame = homePage.clickFrames().clickNestedFrame();
        Assert.assertEquals(nestedFrame.getBottomFrameText(), textBottomFrame, "Incorrect frame clicked");
        Assert.assertEquals(nestedFrame.getLeftFrameText(), textLeftFrame, "Incorrect frame clicked");
    }
}
