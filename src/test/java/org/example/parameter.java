package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class parameter {

    WebDriver driver;

@BeforeClass
    void setup(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("This is title : " +driver.getTitle());
        //driver.close();
    }
    @Test
    void logintest(){
        System.out.println("This is login test");
    }
    @AfterClass
    void tearDown(){
        System.out.println("Browser close");
        driver.close();


    }
}
