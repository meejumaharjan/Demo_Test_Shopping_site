import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssTagandAttribute {
    public static void main(String [] args ) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Utils/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.target.com");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[id=search]")).sendKeys("women boots");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id=search]")).clear();
        driver.findElement(By.cssSelector("input[id=search]")).sendKeys("women sandals");
        driver.findElement(By.cssSelector("input[id=search]")).sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        driver.close();

    }
}
