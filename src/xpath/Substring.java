package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Substring {
    public static void main(String[] args ) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Utils/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        //By name
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();

        //  By CSS-Substring Matches-start with
        driver.findElement(By.cssSelector("input[maxlength^='12']")).sendKeys("meejum18@gmail.com");

        //By CSS-Substring Matches-End with
        driver.findElement(By.cssSelector("input[type$='mit']")).click();

        //  By CSS-Substring-contain
        driver.findElement(By.cssSelector("input[class*='autofocus']")).sendKeys("571");

        //By CSS-Tag, Class and Attribute
        driver.findElement(By.cssSelector("input.a-button-input[id=signInSubmit]")).click();


        Thread.sleep(2000);
        driver.close();




    }
}
