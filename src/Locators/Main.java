package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    static String baseurl="http://tutorialsninja.com/demo/index.php?route=account/login";
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Utils/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);
        try {
            Thread.sleep(5000);


            driver.findElement(By.name("email")).sendKeys("meejum18@yahoo.com");
            driver.findElement(By.name("password")).sendKeys("1234");




        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.close();

    }
}