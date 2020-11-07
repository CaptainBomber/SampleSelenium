package com.company;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Element_ss {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.way2automation.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebElement element = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div[1]/a/img"));
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage bufferedImage = ImageIO.read(file);
        Point point = element.getLocation();
       int ht = element.getSize().getHeight();
        int wt = element.getSize().getWidth();
        BufferedImage eless = bufferedImage.getSubimage(point.getX(),point.getY(),wt,ht);
        ImageIO.write(eless,"jpg",file);
        Date date = new Date();
        String Filename = date.toString().replace(":","_").replace(" ","_")+ ".jpg";

        File ss = new File("C:\\Users\\Admin\\Desktop\\MEd Report\\New folder\\"+Filename);
        FileUtils.copyFile(file,ss);
        //CODE NOT RUNNING







    }
}
