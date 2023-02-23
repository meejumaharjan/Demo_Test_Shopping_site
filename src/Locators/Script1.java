package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {
    public static void main(String[] args ) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Utils/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

        driver.manage().window().maximize();

        driver.findElement(By.name("firstname")).sendKeys("Meeju");

        driver.findElement(By.name("lastname")).sendKeys("Maharjan");

        driver.findElement(By.id("input-email")).sendKeys("meejum18@yahoo.com");

        driver.findElement(By.id("input-telephone")).sendKeys("571-234-1234");

        driver.findElement(By.id("input-password")).sendKeys("1234");
        driver.findElement(By.name("password")).clear();

        driver.findElement(By.id("input-confirm")).sendKeys("1234");
        driver.findElement(By.name("confirm")).clear();






        Thread.sleep(8000);
        driver.close();
    }
}
