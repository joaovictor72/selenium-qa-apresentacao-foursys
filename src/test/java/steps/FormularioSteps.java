package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import pages.FormularioPage;
import pages.LoginPage;
import runner.RunCucumberTest;


public class FormularioSteps extends RunCucumberTest {
    FormularioPage formularioPage = new FormularioPage(driver);
    @Dado("acessei o site do wc aquino")
    public void que_estou_na_tela_wc_aquino() throws InterruptedException {
        formularioPage.acesseiWCAquinoSite();
    }

    @Entao("^preencho o formulario com nome (.*) e sobrenome (.*)$")
    public void preencher_formulario(String nome, String sobrenome) throws InterruptedException {
        formularioPage.preencherFormulario(nome, sobrenome);
    }
}
