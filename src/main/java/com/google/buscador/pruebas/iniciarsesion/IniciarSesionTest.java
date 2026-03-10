package com.google.buscador.pruebas.iniciarsesion;

import com.google.buscador.pruebas.userinterfaces.MapeosNewTours;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IniciarSesionTest {
    private WebDriver driver;
    private MapeosNewTours mapeos;

    private static final String USUARIO = "ella0102.ea@gmail.com";
    private static final String CLAVE = "Ella_0102";

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/");
        mapeos = new MapeosNewTours(driver);
    }

    @Test
    @DisplayName("Debe iniciar sesión correctamente con credenciales válidas")
    void testLoginExitoso() {
        mapeos.escribirUsuario(USUARIO);
        mapeos.escribirClave(CLAVE);
        mapeos.clicEnSubmit();

        Assertions.assertTrue(mapeos.esInicioSesionExitoso(), "El botón SIGN-OFF no es visible");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}