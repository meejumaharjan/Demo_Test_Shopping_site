package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathUsingSingleSlash {
    public static void main(String[] args ) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver.","Utils/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[4]")).click();

        Thread.sleep(2000);

        driver.close();

    }
}
