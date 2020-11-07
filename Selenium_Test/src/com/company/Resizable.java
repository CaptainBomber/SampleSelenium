package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Resizable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //JavascriptExecutor js = (JavascriptExecutor) driver; //this would solve problem with resizing element
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/resizable/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        //WebElement resizeElem = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
        driver.findElement(By.cssSelector("div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se")).click();
        WebElement resizeElem = driver.findElement(By.cssSelector("div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
        //js.executeScript("arguments[0].scrollIntoView();", resizeElem); //this would solve problem with resizing element
        Actions action = new Actions(driver);
        action.dragAndDropBy(resizeElem, 30, 7).perform();
        driver.quit();


    }
}
