package com.company;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserResize {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.way2automation.com/");
        int height=300;
        int width=400;
        for (int i=0; i < 100; i++)
        {
            height = height + 2;
            width = width + 5;
            Dimension dimension = new Dimension(width, height);
            driver.manage().window().setSize(dimension);

        }
    }

}
