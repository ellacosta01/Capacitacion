package com.google.buscador.pruebas.miprimerselenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiPrimeraClase {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.co/");
        driver.findElement(By.name("q")).sendKeys("2+2");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        System.out.println(driver.findElement(By.id("cwos")).getText());

        driver.quit();
    }
}