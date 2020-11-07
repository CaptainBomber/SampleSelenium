package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Slider {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/");
        Thread.sleep(1000);
        WebElement webElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(webElement);
        driver.findElement(By.cssSelector("div#slider > .ui-corner-all.ui-slider-handle.ui-state-default")).click();

        //new Actions(driver).dragAndDropBy(driver.findElement(By.cssSelector("div#slider > .ui-corner-all.ui-slider-handle.ui-state-default")),2,0).perform();
    }
}
