# MiPrimerSelenium 🚀

Proyecto de automatización web desarrollado con **Java + Selenium WebDriver + JUnit 5**.  
Este proyecto contiene ejemplos básicos de pruebas automatizadas utilizando el navegador **Google Chrome**.

El objetivo es practicar automatización de pruebas web, manejo de WebDriver, localización de elementos y ejecución de pruebas automatizadas.

---

# Tecnologías utilizadas

- Java
- Selenium WebDriver
- JUnit 5
- WebDriverManager
- Gradle
- ChromeDriver

---

# Estructura del proyecto

```
MiPrimerSelenium
│
├── src
│   ├── main
│   │
│   └── test
│       └── java
│           └── com.google.buscador.pruebas
│
│               ├── iniciarsesion
│               │       IniciarSesionTest.java
│               │
│               ├── miprimerselenium
│               │       MiPrimeraClase.java
│               │
│               └── userinterfaces
│                       MapeosNewTours.java
│
├── build.gradle
└── settings.gradle
```

---

# Descripción de las clases

## MiPrimeraClase

Esta clase contiene un ejemplo básico de automatización usando Selenium.

La prueba abre el navegador, ingresa a Google, realiza una búsqueda de **2+2** y obtiene el resultado que aparece en la página.

Este ejemplo permite entender:

- Cómo abrir un navegador con Selenium
- Cómo localizar elementos en una página web
- Cómo enviar texto a un campo de búsqueda
- Cómo obtener información del DOM

---

## MapeosNewTours

Esta clase contiene los **localizadores y acciones de la página web** utilizando Selenium.

Se encarga de:

- Localizar los campos de usuario y contraseña
- Localizar el botón de login
- Validar si el inicio de sesión fue exitoso

También utiliza **WebDriverWait** para manejar esperas explícitas y evitar errores por carga de la página.

---

## IniciarSesionTest

Esta clase contiene la prueba automatizada de inicio de sesión utilizando **JUnit 5**.

El flujo de la prueba es:

1. Abrir el navegador Chrome
2. Ingresar a la página de prueba
3. Escribir usuario y contraseña
4. Hacer clic en el botón de login
5. Validar que el inicio de sesión fue exitoso

Para la validación se comprueba que el botón **SIGN-OFF** sea visible en la página.

---

# Dependencias del proyecto

Las dependencias principales utilizadas son:

- **Selenium WebDriver**
- **WebDriverManager**
- **JUnit 5**

Estas se gestionan mediante **Gradle**.

Ejemplo de dependencias:

```gradle
dependencies {

    implementation 'org.seleniumhq.selenium:selenium-java:4.25.0'

    implementation 'io.github.bonigarcia:webdrivermanager:5.9.2'

    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.10.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.10.0'

}
```

---

# Cómo ejecutar el proyecto

1. Clonar el repositorio

```
git clone https://github.com/TU_USUARIO/MiPrimerSelenium.git
```

2. Abrir el proyecto en **IntelliJ IDEA o VS Code**

3. Ejecutar la clase de prueba:

```
IniciarSesionTest
```

o ejecutar los tests desde Gradle.

---

# Características del proyecto

✔ Uso de Selenium WebDriver  
✔ Automatización básica de navegación web  
✔ Ejecución de pruebas con JUnit 5  
✔ Manejo de esperas explícitas con WebDriverWait  
✔ Descarga automática de drivers con WebDriverManager  

---

# Aprendizajes obtenidos

Durante el desarrollo de este proyecto se aprendió:

- Automatización de pruebas web
- Manejo de Selenium WebDriver
- Uso de localizadores en páginas web
- Organización de código en pruebas automatizadas
- Integración de pruebas con JUnit

---

# Autor

Proyecto realizado con fines de aprendizaje en automatización de pruebas.

**Autor:**  
Estudiante de Ingeniería de Software