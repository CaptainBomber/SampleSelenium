package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxes {
   public static WebDriver driver;
//    public static boolean isElementPresent(By by){
//        int size = driver.findElements(by).size();
//        if (size == 1) {
//            return true;
//        }else return false;
//
//    }

    public static void main(String[] args){
         driver = new ChromeDriver();
        driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        int i =1;
        int count = 0;
//        while(isElementPresent(By.xpath("//div[4]/input["+i+"]"))){
//            driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
//            i++;
//            count ++;
//        }
    }
//    List<WebElement> checkBoxes = driver.findElements(By.name("sports"));
//    for(WebElement webElement : checkBoxes){
//        webElement.click();
//    }
}
