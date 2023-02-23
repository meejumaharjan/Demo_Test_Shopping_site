package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bestseller {
    public static void main (String[] args ) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.linkText("Best Sellers")).click();
        String a = driver.findElement(By.linkText("Best Sellers")).getText();
        System.out.println(a);

      // By using double slash or relative xpath;
       String b = driver.findElement(By.xpath("//div[1]/div/div/div/div/div[2]/div/div[2]/div/ol/li[1]/div[2]/div/a[2]/span/div")).getText();
       System.out.println(b);


       String c = driver.findElement(By.linkText("Atomic Habits: An Easy & Proven Way to Build Good Habits &…")).getText();
       System.out.println(c);

       String d = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/ol/li[3]/div[2]/div/a[2]/span/div")).getText();
       System.out.println(d);

       String e = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/ol/li[4]/div[2]/div/a[2]/span/div")).getText();

       System.out.println(e);


      driver.close();

    }
}