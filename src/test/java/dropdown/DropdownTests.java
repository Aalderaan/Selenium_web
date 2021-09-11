package dropdown;

import java.util.List;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption() {
       var dropDownPage = homePage.clickDropDown();

       String option = "Option 1";
       dropDownPage.selectFromDropDown(option);
       List<String> selectedOption  = dropDownPage.getSelectedOption();
       Assert.assertEquals(selectedOption.size(), 1, "Incorrect number of selections");
       Assert.assertTrue(selectedOption.contains(option), "Option not selected ");
    }
}
