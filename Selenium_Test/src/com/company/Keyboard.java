package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class Keyboard {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
        driver.findElement(By.id("identifierId")).sendKeys("pankaj");
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div")).click();
        actions.sendKeys(Keys.chord(Keys.CONTROL+"A")).sendKeys(Keys.chord(Keys.CONTROL+"C")).build().perform();
        driver.findElement(By.id("identifierId")).click();
        actions.sendKeys(Keys.chord(Keys.CONTROL+"V")).perform();

    }
}
