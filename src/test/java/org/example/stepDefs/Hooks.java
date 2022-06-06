package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Hooks {

    public static WebDriver driverH = null ;
    @Before
    public void Open_Browser() throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","F:\\front end testing udacity\\chromedriver.exe");

       driverH = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
     driverH.navigate().to("https://demo.nopcommerce.com/");
     Thread.sleep(3000);

    }

    @After
    public void quitDriver ()
    {
    driverH.quit();
    }

}
