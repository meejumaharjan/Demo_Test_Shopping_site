package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathUsingSingleAttribute {
    public static void main(String[] args ) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver.","Utils/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();


        //Using single attribute xpath
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("coffee");
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);


        Thread.sleep(2000);
        driver.close();

    }
}
