package Ivadas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWorkSeleniumEasySingleFormDemo {

    //https://demo.seleniumeasy.com/basic-first-form-demo.html

    @Test
    public void testSingleInputField() {
        // Driver must use
        Direver.setDriver();
        Direver.getDriver().get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String expecteResult = "Labas vakaras";
        String actualResult;

        WebElement testSingleInputField = Direver.getDriver().findElement(By.xpath("//*[@id='user-messge']"));
        testSingleInputField.sendKeys(expecteResult);

        WebElement buttonshowMessge = Direver.getDriver().findElement(By.xpath("//button[@id='Show Message']"));
        buttonshowMessge.click();

        WebElement paragraftestSingleInputField = Direver.getDriver().findElement(By.xpath("//p[@id='Yor Message']"));
        actualResult = testSingleInputField.getText();

        Assert.assertTrue(
                actualResult.contains(expecteResult),
                String.format("Actual: %s, Expected: %s", actualResult, expecteResult));

        Direver.close();
    }

    @Test
    public void testTwoInputFieldPositive() {
        // Driver must use

        Direver.setDriver();
        Direver.getDriver().get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String valueA = "2";
        String valueB = "3";
        String expecteResult = "5";
        String actualResult;

        WebElement testInputValueA = Direver.getDriver().findElement(By.xpath("//*[@id='sum1']"));
        testInputValueA.sendKeys(expecteResult);
        WebElement testInputValueB = Direver.getDriver().findElement(By.xpath("//*[@id='sum2']"));
        testInputValueB.sendKeys(expecteResult);
        WebElement buttongetTotal = Direver.getDriver().findElement(By.xpath("//button[@id='Get Total']"));
        buttongetTotal.click();

        WebElement paragraftestInputTotal = Direver.getDriver().findElement(By.xpath("//p[@id='total']"));
        actualResult = paragraftestInputTotal.getText();

        Assert.assertTrue(
                actualResult.contains(expecteResult),
                String.format("Actual: %s, Expected: %s", actualResult, expecteResult));

        Direver.close();
    }

    @Test
    public void testTwoInputFieldNegative() {
        // Driver must use

        Direver.setDriver();
        Direver.getDriver().get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String valueA = "a";
        String valueB = "3";
        String expecteResult = "NaN";
        String actualResult;

        WebElement testInputValueA = Direver.getDriver().findElement(By.xpath("//*[@id='sum1']"));
        testInputValueA.sendKeys(expecteResult);
        WebElement testInputValueB = Direver.getDriver().findElement(By.xpath("//*[@id='sum2']"));
        testInputValueB.sendKeys(expecteResult);
        WebElement buttongetTotal = Direver.getDriver().findElement(By.xpath("//button[@id='Get Total']"));
        buttongetTotal.click();

        WebElement paragraftestInputTotal = Direver.getDriver().findElement(By.xpath("//p[@id='total']"));
        actualResult = paragraftestInputTotal.getText();

        Assert.assertTrue(
                actualResult.contains(expecteResult),
                String.format("Actual: %s, Expected: %s", actualResult, expecteResult));

        Direver.close();

    }
}
