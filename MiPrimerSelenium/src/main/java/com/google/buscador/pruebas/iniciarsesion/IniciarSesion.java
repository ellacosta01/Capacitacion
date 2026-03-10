package com.google.buscador.pruebas.iniciarsesion;

import com.google.buscador.pruebas.userinterfaces.MapeosNewTours;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IniciarSesion {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pcc\\Documents\\Intento\\MiPrimerSelenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");

        MapeosNewTours mapeosNewTours=new MapeosNewTours(driver);
        mapeosNewTours.escribirUsuario("ella0102.ea@gmail.com");
        mapeosNewTours.escribirClave("Ella_0102");
        mapeosNewTours.clicEnSumbit();
        mapeosNewTours.validarSignOff();
        driver.quit();
    }
}