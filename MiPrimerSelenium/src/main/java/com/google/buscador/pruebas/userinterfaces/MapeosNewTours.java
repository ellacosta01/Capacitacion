package com.google.buscador.pruebas.userinterfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MapeosNewTours {

    By txtUsuario=By.name("userName");
    By txtClave=By.name("password");
    By btnSubmit=By.name("login");
    WebDriver driver;

    public MapeosNewTours(WebDriver driver) {
        this.driver=driver;
    }

    public void escribirUsuario(String usuario){
        driver.findElement(txtUsuario).sendKeys(usuario);
    }

    public void escribirClave(String clave){
        driver.findElement(txtClave).sendKeys(clave);
    }

    public void clicEnSumbit( ){
        driver.findElement(btnSubmit).click();
    }

    public void validarSignOff(){
        if(driver.findElement(By.xpath("//*[contains(text(),'SIGN-OFF')]")).isDisplayed()){
            System.out.println("Sesion iniciada. Boton para cerrar disponible");
        }
    }
}
