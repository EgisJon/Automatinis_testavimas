package Ivadas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWorkDemoQaTextBox {

    //https://demoqa.com/text-box

    @Test
    public void testInputCurrentAddressFromDemoQa() {
        // Driver must use
        Direver.setDriver();
        Direver.getDriver().get("https://demoqa.com/text-box");

        String expecteResult = "Rugiu g.1, Vilnius";
        String actualResult;

        WebElement testInputCurrentAddress = Direver.getDriver().findElement(By.xpath("//*[@id='currentAddress']"));
        testInputCurrentAddress.sendKeys(expecteResult);

        WebElement buttonSubmit = Direver.getDriver().findElement(By.xpath("//button[@id='submit']"));
        buttonSubmit.click();

        WebElement paragraftestInputCurrentAddress = Direver.getDriver().findElement(By.xpath("//p[@id='currentAddress']"));
        actualResult = paragraftestInputCurrentAddress.getText();

        Assert.assertTrue(
                actualResult.contains(expecteResult),
                String.format("Actual: %s, Expected: %s", actualResult, expecteResult));

        Direver.close();
    }

    @Test
    public void testInputPermanentAddressFromDemoQa() {
        // Driver must use
        Direver.setDriver();
        Direver.getDriver().get("https://demoqa.com/text-box");

        String expecteResult = "Rugiu g.2, Vilnius";
        String actualResult;

        WebElement testInputPermanentAddress = Direver.getDriver().findElement(By.xpath("//*[@id='permanentAddress']"));
        testInputPermanentAddress.sendKeys(expecteResult);

        WebElement buttonSubmit = Direver.getDriver().findElement(By.xpath("//button[@id='submit']"));
        buttonSubmit.click();

        WebElement paragraftestInputPermanentAddress = Direver.getDriver().findElement(By.xpath("//p[@id='permanentAddress']"));
        actualResult = paragraftestInputPermanentAddress.getText();

        Assert.assertTrue(
                actualResult.contains(expecteResult),
                String.format("Actual: %s, Expected: %s", actualResult, expecteResult));

        Direver.close();
    }
}
