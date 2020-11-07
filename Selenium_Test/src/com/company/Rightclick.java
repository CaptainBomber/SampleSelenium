package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Rightclick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/");
        WebElement webElement= driver.findElement(By.xpath("//div[@id='banner-blm']/h2[.='#BlackLivesMatter']"));
        Actions actions = new Actions(driver);
        actions.contextClick().perform();
        driver.quit();
    }
}
