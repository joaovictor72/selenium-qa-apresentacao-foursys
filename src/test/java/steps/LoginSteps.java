package steps;

import cucumber.api.java.es.Dado;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import runner.RunCucumberTest;

import java.util.HashMap;
import java.util.Map;

public class LoginSteps extends RunCucumberTest {
    LoginPage loginPage = new LoginPage(driver);
    @Dado("^efetuei o login no sistema utilizando o usuario (.*) e a senha (.*)$")
    public void que_estou_na_tela_de_login(String usuario,String senha) throws InterruptedException {
        loginPage.loginHeroku(usuario, senha);
    }
}