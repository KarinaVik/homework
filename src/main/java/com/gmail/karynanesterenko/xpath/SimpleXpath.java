package com.gmail.karynanesterenko.xpath;

import com.gmail.karynanesterenko.locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SimpleXpath {
    public void isProductInBasket(WebDriver driver) {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

        driver.get("https://rozetka.com.ua/");

        driver.findElement(By.xpath("//*[@id='header_user_menu_parent']/a")).click();
        driver.findElement(By.xpath("//*[@id=\"popup_signin\"]/div[1]/div[1]/input")).sendKeys("fortestrozetka@ukr.net");
        driver.findElement(By.xpath("//*[@id=\"popup_signin\"]/div[1]/div[2]/div[1]/div[1]/input")).sendKeys("Fortest_2018");
        driver.findElement(By.xpath("//*[@id=\"popup_signin\"]/div[1]/div[2]/div[1]/div[2]/div/span/button")).click();
    }

    public void productInBasket(WebDriver driver) {
        driver.findElement(By.xpath(Locators.SEARCH_Xpath_PRODUCT)).click();
        driver.findElement(By.xpath(Locators.SEARCH_Xpath_CATOGORY)).click();
        driver.findElement(By.xpath(Locators.SEARCH_PRODUCT)).click();
        driver.findElement(By.xpath(Locators.BUTTON_BUY)).click();
    }
}