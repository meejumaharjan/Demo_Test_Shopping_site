package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Navigatecommand {
    public static void main(String[] args ) throws InterruptedException {

        System.setProperty("webdriver.driver.chrome","Utils/chromedriver");
        WebDriver driver=new ChromeDriver();

    //    launch website
        String s="https://www.amazon.com/";
        driver.navigate().to("https://www.amazon.com/");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       driver.navigate().to(s+ "/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fs%3Fk%3Dapple%2Bwatch%26crid%3DI4UWN9RHZCF2%26sprefix%3Dapple%2B%252Caps%252C81%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // using name
        driver.findElement(By.id("createAccountSubmit")).click();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Go back
        driver.navigate().back();
        System.out.println("navigate back to Home Page");

        Thread.sleep(2000);

        //Go forward to Sign in page
        driver.navigate().forward();
        System.out.println("navigate forward to Sign in page");
        Thread.sleep(2000);

        // Navigate to Product apple watch
        driver.navigate().to(s + "s?k=apple+watch&crid=I4UWN9RHZCF2&sprefix=apple+%2Caps%2C81&ref=nb_sb_ss_ts-doa-p_3_6");
        System.out.println("Navigate to Product apple watch");

        //Refresh browser
        driver.navigate().refresh();
        System.out.println("Refresh browser");


        driver.close();


      //  Example from demo

   //     String a="http://tutorialsninja.com/";

//        driver.navigate().to(a+"demo/index.php?route=account/login");
//
//        Thread.sleep(2000);
//        //Click on the Link Text using click() command
//        driver.findElement(By.linkText("Register")).click();
//        System.out.println("Click on Register link");
//
//        Thread.sleep(2000);
//
//        //Go back to Home Page
//        driver.navigate().back();
//        System.out.println("navigate back to Home Page");
//
//        Thread.sleep(2000);
//        //Go forward to Registration page
//        driver.navigate().forward();
//        System.out.println("navigate forward to Registration page");
//        Thread.sleep(2000);
//
//        // Navigate to Product iphone
//        driver.navigate().to(a + "/demo/index.php?route=product/product&product_id=40");
//        System.out.println("Navigate to Product iphone");
////
//        Thread.sleep(5000);
//        //Refresh browser
//        driver.navigate().refresh();
//        System.out.println("Refresh browser");
//
//        driver.navigate().to(a);
//
////        //Closing browser
//        driver.close();
//        System.out.println("Closing browser");

    }
}
