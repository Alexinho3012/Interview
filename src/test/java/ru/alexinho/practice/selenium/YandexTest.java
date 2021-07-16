package ru.alexinho.practice.selenium;


import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class YandexTest {

    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        System.setProperty("webdriver.chrome.driver", "bin\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, 5000, 200);
    }

    @Test
    void testYandexSearch() {
        driver.get("https://yandex.ru");

        String[][] navMenuItems = {
                {"market", "Маркет"},
                {"video", "Видео"},
                {"images", "Картинки"},
                {"maps", "Карты"}
        };

        for (String[] menuItem : navMenuItems) {
            validateNavMenuSection(menuItem[0], menuItem[1]);
        }


        WebElement searchField = driver.findElement(By.xpath("//input[@id = 'text']"));
        searchField.sendKeys("porsche 356b 1 : 18 model");

        WebElement searchButton = driver.findElement(By.xpath("//div[@class = 'search2__button']/button"));
        searchButton.click();


        List<WebElement> searchResults = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy
                (By.xpath("//ul[@id = 'search-result']/li")));
        Assertions.assertTrue(searchResults.size() >= 1);


        WebElement pageNumberThree = driver.findElement(By.xpath("//div[@class = 'pager__items']/a [text() = '3']"));
        Assertions.assertNotNull(pageNumberThree);

        pageNumberThree.click();


        Assertions.assertTrue(driver.getCurrentUrl().startsWith("https://yandex.ru"));

    }

    void validateNavMenuSection(String logo, String logoText) {
        WebElement marketLogo = driver.findElement(By.xpath(String.format
                ("//a[@data-id = '%s']/div[@class = 'services-new__icon']", logo)));
        Assertions.assertNotNull(marketLogo);

        WebElement marketLogoText = driver.findElement(By.xpath(String.format
                ("//div[@class = 'services-new__item-title' and text() = '%s']", logoText)));
        Assertions.assertNotNull(marketLogoText);
    }

    @AfterEach
    void tearDown() {
        driver.close();
    }
}

