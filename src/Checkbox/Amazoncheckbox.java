package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Amazoncheckbox {
    public static void main(String[] args ){

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Gift Cards")).click();
//        int w = driver.findElements(By.xpath("//*[@class='a-icon a-icon-checkbox']")).size();
//        System.out.println(w);
//
//
//        for(int i=3;i<w;i++){
//            driver.findElements(By.xpath("//*[@class='a-icon a-icon-checkbox']")).get(i).click();
//            String value = driver.findElements(By.xpath("///*[@class='a-icon a-icon-checkbox']")).get(i).getText();
//            System.out.println(value+"\n");
//        }

        WebElement element= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/ul/li[1]/span/a/div/label/i"));
        System.out.println(element.isSelected());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        element.click();

        driver.navigate().back();
        System.out.println("navigate back to Home Page");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

      // driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/ul/li[1]/span/a/div/label/i")).isSelected();

        driver.close();
        driver.quit();

    }
}
