package com.gmail.karynanesterenko;

import com.gmail.karynanesterenko.xpath.SimpleXpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main{
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karina\\project\\test\\webdrivers\\chromedriver.exe");
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        SimpleXpath simpleXpath = new SimpleXpath();
        simpleXpath.isProductInBasket(driver);
        simpleXpath.productInBasket(driver);
    }
}