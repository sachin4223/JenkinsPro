package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {
    ChromeDriver driver = new ChromeDriver();
    @BeforeClass
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize(); //for window to maximize
    }
    @Test
    public void googleTest() throws InterruptedException {

//        driver.findElement(By.id("user-name")).sendKeys("standard_user");//user-name
//        Thread.sleep(1000);
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");//user-name
//        Thread.sleep(1000);
//        driver.findElement(By.id("login-button")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//        Thread.sleep(3000);
       // Assert.assertEquals(driver.getTitle(), "Swag Labs");

//        driver.findElement(By.linkText("Sauce Labs Backpack")).click();
//        Thread.sleep(4000);

//        driver.findElement(By.partialLinkText("Sauce")).click();
//        Thread.sleep(2000);
//
//       String str= driver.findElement(By.className("inventory_details_price")).getText();
//        System.out.println(str);

//        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.linkText("Sauce Labs Bike Light")).click();
//        Thread.sleep(1000);
//
//        String str1= driver.findElement(By.className("inventory_details_price")).getText();
//        System.out.println(str1);


        //using xpath
//        driver.findElement(By.xpath("//input[@id='user-name' or @name='user-name2']")).sendKeys("standard_user");///html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
        Thread.sleep(2000);

        //options of xpath
        //1. or, and, text(), contain(), starts-with()

        //contains-: Syntax--> //tagname[contains(@attribute,value)] ex-:"//input[contains(@id,'user')]"
        //start-with-: Syntax--> //tagname[start-with(@attribute,value)] ex-:"//input[start-with(@id,'us')]"
        //text-: Syntax-->
    }
    @AfterClass
    void close(){
        driver.close();
    }


}
