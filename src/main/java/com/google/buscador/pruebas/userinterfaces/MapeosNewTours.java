package com.google.buscador.pruebas.userinterfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MapeosNewTours {
    private WebDriver driver;
    private WebDriverWait wait;

    private By txtUsuario = By.name("userName");
    private By txtClave = By.name("password");
    private By btnSubmit = By.name("login");
    private By btnSignOff = By.xpath("//*[contains(text(),'SIGN-OFF')]");

    public MapeosNewTours(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void escribirUsuario(String usuario) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtUsuario)).sendKeys(usuario);
    }

    public void escribirClave(String clave) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtClave)).sendKeys(clave);
    }

    public void clicEnSubmit() {
        wait.until(ExpectedConditions.elementToBeClickable(btnSubmit)).click();
    }

    public boolean esInicioSesionExitoso() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(btnSignOff)).isDisplayed();
    }
}