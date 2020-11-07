package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchToNewWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.hdfcbank.com/");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(10000);
        webDriver.findElement(By.xpath("//div[@id='custom-button']/button[@type='button']")).click();
//        webDriver.findElement(By.cssSelector(".btn-primary.ng-scope")).click();

    }
}
