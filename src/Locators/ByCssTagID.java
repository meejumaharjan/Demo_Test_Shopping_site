package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssTagID {
    public static void main (String [] args ){

        System.setProperty("webdriver. chrome. driver.", "Utils/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to ("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input#input-email")).sendKeys("meejum18@yahoo.com");
        driver.findElement(By.cssSelector("input#input-email")).clear();
        driver.findElement(By.cssSelector("input#input-email")).sendKeys("meeju.m@gmail.com");

        driver.findElement(By.cssSelector("input#input-password")).sendKeys("1234");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }

}
