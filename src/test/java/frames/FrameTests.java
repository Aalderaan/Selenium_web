package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

public class frameTests extends BaseTests {

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
}
