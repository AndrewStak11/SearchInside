package org.example;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Search {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://blog.skillfactory.ru/compilation/testy-kotorye-pomogut-vybrat-professiyu/");
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            driver.findElement(By.cssSelector("#header > div.header__right > button > svg")).click();
            driver.findElement(By.cssSelector("#s")).sendKeys("Программирование");
            driver.findElement(By.cssSelector("#s")).sendKeys(Keys.RETURN);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}