package Screenshot;

import com.sun.deploy.cache.Cache;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args )throws Exception{
        System.setProperty("webdriver.chrome.driver", "Utils/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");

        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(source, new File ("Utils/Screenshots/Screen1.png"));
        System.out.println("Screenshot is taken");


        driver.quit();



    }

}
