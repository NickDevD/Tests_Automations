package com.autologin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Coletando os elementos da página para teste
    By usernameField = By.id("signin-email");
    By passwordField = By.id("signin-password");
    By loginButton = By.id("signin-button");

    // Método que executa o processo de login
    public void loginTest(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

}
