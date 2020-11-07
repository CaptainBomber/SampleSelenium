package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;


public class Weblistener extends AbstractWebDriverEventListener {
public void after(WebElement element, WebDriver driver){
   System.out.println("event clicked");
}
}
