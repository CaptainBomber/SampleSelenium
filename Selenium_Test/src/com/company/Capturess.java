package com.company;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Capturess {
   public static WebDriver driver = new ChromeDriver();
    public static  void capture_ss() throws IOException {
        Date date = new Date();
        String Filename = date.toString().replace(":","_").replace(" ","_")+ ".jpg";
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Users\\Admin\\Desktop\\MEd Report\\New folder\\"+Filename));

    }
    public static void main(String[] args) throws IOException {

        driver.get("https://www.browserstack.com/guide/take-screenshots-in-selenium");
        capture_ss();
    }
}
