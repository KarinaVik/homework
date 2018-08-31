package com.gmail.karynanesterenko;

import com.gmail.karynanesterenko.locators.Locators;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleXpathTest {

    private WebDriver driver;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karina\\project\\test\\webdrivers\\chromedriver.exe");
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
        driver.get("https://rozetka.com.ua/");
    }

    @Test
    public void testFindElement() {
        driver.findElement(By.xpath("//*[@id='header_user_menu_parent']/a")).click();
        driver.findElement(By.xpath("//*[@id=\"popup_signin\"]/div[1]/div[1]/input")).sendKeys("fortestrozetka@ukr.net");
        driver.findElement(By.xpath("//*[@id=\"popup_signin\"]/div[1]/div[2]/div[1]/div[1]/input")).sendKeys("Fortest_2018");
        driver.findElement(By.xpath("//*[@id=\"popup_signin\"]/div[1]/div[2]/div[1]/div[2]/div/span/button")).click();
    }

    @Test
    public void testProductInBasket() {
        driver.findElement(By.xpath(Locators.SEARCH_Xpath_PRODUCT)).click();
        driver.findElement(By.xpath(Locators.SEARCH_Xpath_CATOGORY)).click();
        driver.findElement(By.xpath(Locators.SEARCH_PRODUCT)).click();
        driver.findElement(By.xpath(Locators.BUTTON_BUY)).click();
    }
}