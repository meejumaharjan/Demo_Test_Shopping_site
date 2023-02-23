package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class xpathusingContains {
    public static void main(String[] args ) {

        System.setProperty("webdriver.chromedriver.", "Utils/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[contains(@name,'field-keywords')]")).sendKeys("apple watch");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[contains(@name,'field-keywords')]")).clear();
        driver.findElement(By.xpath("//*[contains(@name,'field-keywords')]")).sendKeys("Android");
        driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.close();
    }
}


