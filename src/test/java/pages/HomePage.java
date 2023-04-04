package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage extends Utils {

    WebDriver driver;
    Faker faker = new Faker();
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao(){
        driver.manage().window().maximize();
        driver.get("http://automationpratice.com.br");
        assertEquals("http://automationpratice.com.br/", driver.getCurrentUrl());
        assertTrue("A mensagem do título está errada!!", driver.getTitle().contains("QAZANDO Shop E-Commerce"));

    }
    public void linkCadastro(){
        driver.findElement(By.className("fa-lock")).click();
    }
    public void inputsForm(){
        esperaElemento(By.id("user"),10);
        driver.findElement(By.id("user")).sendKeys(faker.name().fullName());
        driver.findElement(By.id("email")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.id("password")).sendKeys(faker.internet().password());
    }
    public void btnCadastrar(){
        driver.findElement(By.id("btnRegister")).click();
    }
    public void cadastroOk(){
        String textCadastro = driver.findElement(By.id("swal2-title")).getText();
        assertEquals("Cadastro realizado!",textCadastro);
        driver.findElement(By.className("swal2-confirm")).click();
    }
}
