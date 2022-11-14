package pom.test.demoepa;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.pages.demoepa.TextBox_Pages;


public class TextBoxTest {


    @Test
    public void testInputFullName() {
        TextBox_Pages.openUrl("https://demoqa.com/text-box");

        String expectedResult = "Egidijus";
        String actualResult;

        TextBox_Pages.inputFullName(expectedResult);
        TextBox_Pages.clickButtonSubmit();
        actualResult = TextBox_Pages.readMassageFullName();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );


        TextBox_Pages.sleep(2000);

        TextBox_Pages.close();
    }
    @Test
    public void testInputEmail(){
        TextBox_Pages.openUrl("https://demoqa.com/text-box");

        String expectedResult = "egis331@gmail.com";
        String actualResult;

        TextBox_Pages.inputEmail(expectedResult);
        TextBox_Pages.clickButtonSubmit();
        actualResult = TextBox_Pages.readMassageEmail();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );


        TextBox_Pages.sleep(2000);

        TextBox_Pages.close();

    }
}
