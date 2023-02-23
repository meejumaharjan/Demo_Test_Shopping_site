package Radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_test {
    public static void main(String[] args ){

        System.setProperty("webdriver.driver.chrome", "Utils/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("file:///Users/meejumaharjan/Documents/Demo_Test_Shopping_site/Utils/radio.html");

        int a = driver.findElements(By.xpath("//input [@name='group1']")).size();
        System.out.println(a);
        for(int i=0;i<a;i++) {
            driver.findElements(By.xpath("//input [@name='group1']")).get(i).click();
            String value = driver.findElements(By.xpath("//input [@name='group1']")).get(i).getAttribute("value");
            System.out.println(value+"\n");
        }



//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)i
        driver.close();
        driver.quit();

    }

}
