package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class xpathusingStartswith {
    public static void main(String[] args ) {

        System.setProperty("webdriver.chrome.driver.", "Utils/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[starts-with(@name,'field')]")).sendKeys("apple watch");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[starts-with(@id,'nav')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.close();
    }
}
