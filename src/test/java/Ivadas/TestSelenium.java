package Ivadas;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.channel.ChannelOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium {

    @Test
    public void testDemo1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.vilniuscoding.lt/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8)); //laukia uzkrovimo pilno
      //  driver.manage().window().maximize(); //pervisa langa
      //  driver.manage().window().setSize(new Dimension(2000, 3000)); //dalinis ekranas
       // driver.findElement(By.xpath(" Ir uzdaro reklama")).click(); // uzsidaro reklama



       // driver.quit();

    }


    @Test
    public void testInputFullNameFromDemoQa(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.75");
        options.addArguments("--incognito");
        options.addArguments("--headless");



        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://demoqa.com/text-box");


        String expecteResult = "Egidijus";
        String actualResult;

       WebElement inputFullName = driver.findElement(By.xpath("//*[@id='userName']"));
       inputFullName.sendKeys(expecteResult);

        WebElement buttonSubmit = driver.findElement((By.xpath("//button[@id='submit']")));
        buttonSubmit.click();

        WebElement paragrafFullName = driver.findElement(By.xpath( "//p[@id='name']"));
        actualResult = paragrafFullName.getText();


        Assert.assertTrue(
                actualResult.contains(expecteResult),
                String.format("Actual: %s, Expected: %s", actualResult, expecteResult)
        );


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

    @Test
    public void testInputEmailDemoQa(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.75");
        options.addArguments("--incognito");
        options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://demoqa.com/text-box");

        String expecteResult = "egis555@xmat.lt";
        String actualResult;

        WebElement inputEmailName = driver.findElement(By.xpath("//*[@id='userEmail']"));
        inputEmailName.sendKeys(expecteResult);

        WebElement buttonSubmit = driver.findElement((By.xpath("//button[@id='submit']")));
        buttonSubmit.click();

        WebElement paragrafEmailName = driver.findElement(By.xpath( "//p[@id='email']"));
        actualResult = paragrafEmailName.getText();

        Assert.assertTrue(
                actualResult.contains(expecteResult),
                String.format("Actual: %s, Expected: %s", actualResult, expecteResult));

        driver.quit();

    }
}
