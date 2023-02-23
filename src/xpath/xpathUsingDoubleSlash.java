package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathUsingDoubleSlash {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");

       //Using single slash
       // driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[4]")).click();

        //Using double slash/Relative xpath
        driver.findElement(By.xpath("//div/a[2]/span/div")).click();

        Thread.sleep(2000);

        driver.close();



    }
}
