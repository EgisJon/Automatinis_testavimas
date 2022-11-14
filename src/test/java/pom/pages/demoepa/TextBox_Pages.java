package pom.pages.demoepa;

import org.openqa.selenium.By;
import pom.pages.Common;

public class TextBox_Pages {
    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void sleep(int millis) {
       Common.sleep(millis);
    }

    public static void close() {
        Common.close();
    }

    public static void inputFullName(String message) {
        Common.senKeysToElement(
                By.xpath("//input[@id='userName']"),
                message
        );

    }

    public static void clickButtonSubmit() {
        Common.clickElement(By.xpath("//button[@id='submit']")
        );

    }

    public static String readMassageFullName() {
        return Common.getTextFromElement(
                By.xpath("//p[@id='name']")

        );
    }

    public static void inputEmail(String email) {
        Common.senKeysToElement(By.xpath("//input[@id='userEmail']"),
                email
        );
    }

    public static String readMassageEmail() {
        return Common.getTextFromElement(By.xpath("//p[@id='email']")
        );
    }
}
