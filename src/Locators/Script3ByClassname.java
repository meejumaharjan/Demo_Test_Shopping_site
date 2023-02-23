package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3ByClassname {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Utils/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=account/login");

        driver.findElement(By.className("form-control")).sendKeys("Macbook");
        driver.findElement(By.cssSelector("#search>span>button")).click();

        Thread.sleep(8000);
        driver.close();
    }
}
