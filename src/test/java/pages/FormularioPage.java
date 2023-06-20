package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class FormularioPage {

    public static final String URL_BASE_WC_AQUINO = "https://wcaquino.me/selenium/componentes.html";
    private By element_nome = By.id("elementosForm:nome");
    private By element_sobrenome = By.id("elementosForm:nome");

    private By sexo_masculino = By.id("elementosForm:sexo:0");
    private By comida = By.id("elementosForm:escolaridade");

    private By escolaridade = By.id("elementosForm:escolaridade");
    WebDriver driver;
    public FormularioPage(WebDriver driver){
        this.driver = driver;
    }

    public void acesseiWCAquinoSite(){
        driver.get(URL_BASE_WC_AQUINO);
    }

    public void preencherFormulario(String nome, String sobrenome){
        driver.findElement((element_nome)).click();
        driver.findElement((element_nome)).sendKeys(nome);
        driver.findElement((element_sobrenome)).sendKeys(sobrenome);
        driver.findElement((sexo_masculino)).click();
        driver.findElement((comida)).click();
        driver.findElement((escolaridade)).click();
    }
}
