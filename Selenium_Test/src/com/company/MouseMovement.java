package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class MouseMovement {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        Weblistener weblistener = new Weblistener();
        eventFiringWebDriver.register(weblistener);
        EventFiringMouse eventFiringMouse = new EventFiringMouse(driver,weblistener);
        Locatable hover = (Locatable)driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a"));
        Coordinates coordinates = hover.getCoordinates();
        try {
            eventFiringMouse.mouseMove(coordinates);
        } catch (Throwable t){

        }

        Thread.sleep(5000);

    }
}
