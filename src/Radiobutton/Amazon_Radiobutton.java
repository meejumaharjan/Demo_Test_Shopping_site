package Radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Amazon_Radiobutton {
    public static void main(String[] args ) {

        System.setProperty("webdriver.driver.chrome", "Utils/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("icp-nav-link-inner")).click();
        int o = driver.findElements(By.xpath("//*[@class='a-icon a-icon-radio']")).size();
        System.out.println(o);

        for(int i=0;i<=o;i++) {
            driver.findElements(By.xpath("//*[@class='a-icon a-icon-radio']")).get(i).click();
           //String value = driver.findElements(By.xpath("//*[@class='a-icon a-icon-radio']")).get(i).getText();
         //  System.out.println(value+"\n");

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(By.className("a-button-input")).click();
        }

        driver.close();
        driver.quit();

    }
}
