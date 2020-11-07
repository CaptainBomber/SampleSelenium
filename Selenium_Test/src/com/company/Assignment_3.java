package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("   ");

        WebElement a = driver.findElement(By.xpath("//*[@id=\"mathq2\"]"));

        String  s  = a.getText();
        int b = Character.getNumericValue(s.charAt(0));
        int c = Character.getNumericValue(s.charAt(4));
        int d = b+c;

        System.out.println(b+c );
        driver.findElement(By.xpath("//*[@id=\"pollform\"]/table/tbody/tr[2]/td/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"mathuserans2\"]")).sendKeys(Integer.toString(d));
        driver.findElement(By.xpath("//*[@id=\"pollform\"]/table/tbody/tr[4]/td/div")).click();


    }
}
