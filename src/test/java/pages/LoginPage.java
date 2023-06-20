package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;
    public class LoginPage extends Utils {
        private By user_name = By.name("username");
        private By password = By.name("password");

        WebDriver driver;
        public LoginPage(WebDriver driver){
            this.driver = driver;
        }

        public void loginHeroku(String usuario, String senha) throws InterruptedException {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(user_name).click();
            driver.findElement(user_name).sendKeys(usuario);
            driver.findElement(password).click();
            driver.findElement(password).sendKeys(senha);
        }
    }
