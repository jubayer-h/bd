package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tryfor {
    @Test(priority = 1)
    void setup() {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("This is title : " +driver.getTitle());
    }

    @Test(priority = 2)
    void login() {
        System.out.println("logini");
    }

    @Test(priority = 3,groups = {"sanity"})
    void teardown() {
        System.out.println("close brower");
    }

}
