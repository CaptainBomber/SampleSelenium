package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.sql.DriverPropertyInfo;

public class SeleniumScript {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        Weblistener weblistener = new Weblistener();
        eventFiringWebDriver.register(weblistener);
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")).click();
        Thread.sleep(1000);

    }
}
