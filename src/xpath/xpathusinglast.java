package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class xpathusinglast {
    public static void main(String[] args ){

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("(//input[@type='password']) [last()]")).sendKeys("1234");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.close();




    }

}
