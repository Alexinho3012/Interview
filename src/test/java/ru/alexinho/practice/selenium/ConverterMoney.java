package ru.alexinho.practice.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConverterMoney {
    WebDriver driver;

    @Test
    void testConvertation(){
        System.setProperty("webdriver.chrome.driver", "bin\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor)driver;


        driver.get("https://www.sberbank.ru/ru/quotes/currencies");
        WebElement chooseCurrency = driver.findElement(By.xpath("//div[@data-test-id = 'SelectControl_Button-currency']"));
        chooseCurrency.click();
        WebElement chooseCurrencyUSD = driver.findElement(By.xpath(
                "//div[3]/div[1]/div/div/div/div/div/div[2]//div[1]/div/div/div[2]/div/div[1]/ul/button[1]/span"));
        chooseCurrencyUSD.click();

        jse.executeScript("window.scrollBy(0,750)");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement getUSD = driver.findElement(By.xpath(
                "//input[@class='rates-converter-field__input']"));
        getUSD.click();
        getUSD.clear();
    }
}
