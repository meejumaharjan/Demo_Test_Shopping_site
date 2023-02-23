package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class xpathusingText {
    public static void main(String[] args ){

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");

        driver.findElement(By.xpath("//*[text()='Select your address'}"));

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.close();
      //  didnt work

    }
}
