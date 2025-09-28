package com.autologin.testes;

import com.autologin.pages.LoginPage;
import com.autologin.utils.PropertiesLeitor;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {

    private static final Logger logger = LoggerFactory.getLogger(LoginTest.class);
    private WebDriver driver;
    private LoginPage loginPage;

    private final String URL_LOGIN = "https://accounts.descomplica.com.br/?returnUrl=https://aulas.descomplica.com.br/graduacao/ciencia-da-computacao/";
    private final String URL_DESTINO = "https://accounts.descomplica.com.br/?returnUrl=https://aulas.descomplica.com.br/graduacao/ciencia-da-computacao/";

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(URL_LOGIN);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLoginComCredenciaisValidas() {
        String username = PropertiesLeitor.getProperty("test.username");
        String password = PropertiesLeitor.getProperty("test.password");

        logger.info("Iniciando o teste de login com credenciais válidas.");

        loginPage.loginTest(username, password); // Assumindo que você renomeou o método

        logger.info("Login realizado. Verificando a URL de destino.");

        // Asserção correta: verifica se a URL atual é a URL de destino esperada
        assertEquals(URL_DESTINO, driver.getCurrentUrl());

        logger.info("Teste de login concluído com sucesso.");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}