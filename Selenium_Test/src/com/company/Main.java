package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	// write your code here

       WebDriver driver = new ChromeDriver();
       driver.get("https://money.rediff.com/gainers");
        List<WebElement> rownum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        System.out.println("row count is "+rownum.size());
        List<WebElement> colnum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
        System.out.println("col count is " +colnum.size());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        for(int i = 1; i <= rownum.size();i++){
            for (int j = 1 ; j<=colnum.size();j++){
                System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" +i+ "]/td[" +j+ "]")).getText()+"  ");
                

            }
            System.out.println();
        }
      

    }
}
