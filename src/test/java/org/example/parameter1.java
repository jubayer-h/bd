package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter1 {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser, String app){

        if (browser.equalsIgnoreCase("Chrome"))
        {
            driver=new ChromeDriver();
        }
         else if  (browser.equalsIgnoreCase("firefox"))
        {
           driver =new FirefoxDriver();

        }
         else if (browser.equalsIgnoreCase("edge"))
         {
             driver =new EdgeDriver();
        }
         else if(browser.equalsIgnoreCase("safari")){
             driver=new SafariDriver();
        }

        //driver.get("https://www.google.com/");
        driver.get(app);
        System.out.println( driver.getTitle());


    }
    @AfterClass
    void tearDown(){
        driver.close();
    }
    @Test
    void logIn(){
        System.out.println("This is login test");
    }
}
