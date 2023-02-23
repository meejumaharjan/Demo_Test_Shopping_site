package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkbox_test {
    public static void main(String[] args ){

        System.setProperty("webdriver.driver.chrome","Utils/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();


        //By name
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();

        //  By xpath-single attribute
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("meejum18@gmail.com");

        //By CSS-Substring Matches-End with
        driver.findElement(By.cssSelector("input[type$='mit']")).click();

        //  By CSS-Substring-contain
        driver.findElement(By.cssSelector("input[class*='autofocus']")).sendKeys("sabmeej571");

        //using absolute xpath
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[2]/div/div/label/div/label/input")).isSelected());
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[2]/div/div/label/div/label/input")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[2]/div/div/label/div/label/input")).isSelected());

        System.out.println("Keep me signed in.");
        //By CSS-Tag, Class and Attribute
        driver.findElement(By.cssSelector("input.a-button-input[id=signInSubmit]")).click();



        driver.close();
        driver.quit();


    }
}
