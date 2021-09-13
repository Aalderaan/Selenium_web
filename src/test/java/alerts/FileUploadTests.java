package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpoad() {
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("/Users/dalinet/IdeaProjects/SeleniumDemo/src/main/resources/chromedriver ");
        Assert.assertEquals(fileUploadPage.getUploadedFiles(), "chromedriver", "Uploaded files incorrect");
    }
}
