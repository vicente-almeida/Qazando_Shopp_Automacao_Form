package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;


public class CadastroStep extends RunCucumberTest {
    HomePage homePage = new HomePage(driver);




    @Dado("^que eu acesso o site da loja$")
    public void que_eu_acesso_o_site_da_loja() {
        homePage.acessarAplicacao();

    }


    @E("^clico no link Cadastro$")
    public void clico_no_link_Cadastro() {
        homePage.linkCadastro();



    }

    @E("^preencho todos os inputs do formulário$")
    public void  preencho_todos_os_inputs_do_formulario() {
        homePage.inputsForm();



    }

    @Quando("^clico no botão Cadastrar$")
    public void clico_no_botao_Cadastrar() {
        homePage.btnCadastrar();


    }

    @Então("^o usuário será cadastrado com sucesso$")
    public void o_usuário_sera_cadastrado_com_sucesso() {
        homePage.cadastroOk();



    }

}

