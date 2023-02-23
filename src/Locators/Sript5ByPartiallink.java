package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sript5ByPartiallink {
    public static void main(String[] args ) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Utils/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");

        driver.manage().window().maximize();

        driver.findElement(By.partialLinkText("Canon")).click();

        Thread.sleep(8000);
        driver.close();
    }
}
